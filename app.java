package com.ecom.model;

public class SparePart {
    private long id;
    private String name;
    private String vehicleType;
    private double price;

    
}
package com.ecom.dao;

import com.ecom.model.SparePart;

import java.util.List;

public interface SparePartDAO {
    List<SparePart> getAllSpareParts();
    SparePart getSparePartById(long id);
    void addSparePart(SparePart sparePart);
    void updateSparePart(SparePart sparePart);
    void deleteSparePart(long id);
}
package com.ecom.service;

import com.ecom.model.SparePart;

import java.util.List;

public interface SparePartService {
    List<SparePart> getAllSpareParts();
    SparePart getSparePartById(long id);
    void addSparePart(SparePart sparePart);
    void updateSparePart(SparePart sparePart);
    void deleteSparePart(long id);
}
package com.ecom.controller;

import com.ecom.model.SparePart;
import com.ecom.service.SparePartService;

import java.util.List;

public class SparePartController {
    private final SparePartService sparePartService;

    public SparePartController(SparePartService sparePartService) {
        this.sparePartService = sparePartService;
    }

    public List<SparePart> getAllSpareParts() {
        return sparePartService.getAllSpareParts();
    }

    public SparePart getSparePartById(long id) {
        return sparePartService.getSparePartById(id);
    }

    public void addSparePart(SparePart sparePart) {
        sparePartService.addSparePart(sparePart);
    }

    public void updateSparePart(SparePart sparePart) {
        sparePartService.updateSparePart(sparePart);
    }

    public void deleteSparePart(long id) {
        sparePartService.deleteSparePart(id);
    }
}
package com.ecom.ui;

import com.ecom.controller.SparePartController;
import com.ecom.model.SparePart;

import java.util.Scanner;

public class ConsoleUI {
    private final SparePartController sparePartController;
    private final Scanner scanner;

    public ConsoleUI(SparePartController sparePartController) {
        this.sparePartController = sparePartController;
        this.scanner = new Scanner(System.in);
    }


}
package com.ecom;

import com.ecom.controller.SparePartController;
import com.ecom.dao.SparePartDAO;
import com.ecom.dao.SparePartDAOImpl;
import com.ecom.service.SparePartService;
import com.ecom.service.SparePartServiceImpl;
import com.ecom.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        SparePartDAO sparePartDAO = new SparePartDAOImpl(); // Implement this DAO
        SparePartService sparePartService = new SparePartServiceImpl(sparePartDAO);
        SparePartController sparePartController = new SparePartController(sparePartService);
        ConsoleUI consoleUI = new ConsoleUI(sparePartController);
        
    
    }
}
