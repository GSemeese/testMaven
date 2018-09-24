/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.gitmaven;

/**
 *
 * @author demun
 */
public class BranchClass {
   
    private String branchName;
    private int branchInt;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchInt() {
        return branchInt;
    }

    public void setBranchInt(int branchInt) {
        this.branchInt = branchInt;
    }

    public BranchClass(String branchName, int branchInt) {
        this.branchName = branchName;
        this.branchInt = branchInt;
    }
    
}
