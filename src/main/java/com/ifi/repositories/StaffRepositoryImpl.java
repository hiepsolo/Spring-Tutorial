package com.ifi.repositories;

import com.ifi.models.Staff;

import java.util.ArrayList;
import java.util.List;

public class StaffRepositoryImpl implements StaffRepository {
    public List<Staff> getAllStaffs() {
        List<Staff> staffList = new ArrayList<Staff>();
        staffList.add(new Staff("Pavel", "31"));
        return staffList;
    }
}