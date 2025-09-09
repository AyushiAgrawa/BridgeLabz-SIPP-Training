package Generics.Day2_GenericsProgrammingElements;

import java.time.LocalDate;
import java.util.*;

class Policy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    double premium;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, double premium) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.premium = premium;
    }

    public String toString() {
        return "[" + policyNumber + ", " + policyholderName + ", " + expiryDate + ", " + premium + "]";
    }
}

public class InsurancePolicySystem {

  
    private Map<String, Policy> hashMapPolicies = new HashMap<>();
    private Map<String, Policy> linkedHashMapPolicies = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> treeMapPoliciesByExpiry = new TreeMap<>();


    public void addPolicy(Policy policy) {
        hashMapPolicies.put(policy.policyNumber, policy);
        linkedHashMapPolicies.put(policy.policyNumber, policy);
        treeMapPoliciesByExpiry.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return hashMapPolicies.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringInNext30Days() {
        List<Policy> result = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Map.Entry<LocalDate, List<Policy>> entry : treeMapPoliciesByExpiry.subMap(today, true, next30Days, true).entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;
    }

    
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : hashMapPolicies.values()) {
            if (policy.policyholderName.equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        
        treeMapPoliciesByExpiry.headMap(today, true).clear();

       
        hashMapPolicies.values().removeIf(p -> p.expiryDate.isBefore(today) || p.expiryDate.isEqual(today));
        linkedHashMapPolicies.values().removeIf(p -> p.expiryDate.isBefore(today) || p.expiryDate.isEqual(today));
    }

    public static void main(String[] args) {
        InsurancePolicySystem system = new InsurancePolicySystem();

        system.addPolicy(new Policy("P001", "Ayesha", LocalDate.now().plusDays(10), 1000));
        system.addPolicy(new Policy("P002", "Bobby", LocalDate.now().plusDays(40), 1500));
        system.addPolicy(new Policy("P003", "Ayesha", LocalDate.now().plusDays(20), 1200));
        system.addPolicy(new Policy("P004", "Chanchal", LocalDate.now().minusDays(5), 2000));

        System.out.println("Retrieve Policy P001: " + system.getPolicyByNumber("P001"));
        System.out.println("Policies expiring in next 30 days: " + system.getPoliciesExpiringInNext30Days());
        System.out.println("Policies for Ayesha: " + system.getPoliciesByHolder("Alice"));

        system.removeExpiredPolicies();
        System.out.println("All policies after removing expired ones: " + system.hashMapPolicies.values());
    }
}
