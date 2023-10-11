package com.example.demoTest;

import com.example.demoTest.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class DemoTest {
        public static void main(String[] args) {
            ElectricProduct electricProduct1 =
                    new ElectricProduct("bong den", "thuỷ tinh", "VN", "KW");

            ElectricProduct electricProduct2 =
                    new ElectricProduct("quat", "sắt", "VN", "KW");

            HouseHoldProduct houseHoldProduct =
                    new HouseHoldProduct("tủ", "gỗ", "Mỹ");

            FoodProduct foodProduct =
                    new FoodProduct("bánh", "bột", "Pháp");

            Product[] products = {electricProduct1, electricProduct2, houseHoldProduct, foodProduct};

            for(Product p : products) {
                p.printInformation();
            }

        }
}
