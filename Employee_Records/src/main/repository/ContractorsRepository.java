package main.repository;

import main.employees.Contractor;

import java.util.ArrayList;

public class ContractorsRepository {

    private static final ArrayList<Contractor> contractorsList = new ArrayList<>();

    public ContractorsRepository() {
        contractorsList.add(new Contractor("Jerry", "Seinfeld", 40000));
    }

    public ArrayList<Contractor> getContractorsList() {
        return contractorsList;
    }

    public void addContractor(Contractor contractor) throws NullPointerException {
        if (contractor != null) {
            contractorsList.add(contractor);
        } else {
            throw new NullPointerException("Employee cannot be null");
        }
    }

}
