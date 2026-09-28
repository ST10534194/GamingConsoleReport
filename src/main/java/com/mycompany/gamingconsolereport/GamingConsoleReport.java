/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

public static void main(String[] args) {
// 1D Array for cities
String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

// 1D Array for console types
String[] consoles = {"PS5", "XBOX", "SWITCH"};

// 2D Array for sales data [City][Console]
int[][] sales = {
{1000, 2000, 3000}, // Cape Town
{2000, 3000, 4000}, // Port Elizabeth
{1500, 1100, 1200} // Pretoria
};

// 1D Array to store calculated city totals
int[] cityTotals = new int[cities.length];

// --- DISPLAY GAMING CONSOLE REPORT ---
System.out.println("--------------------------------------------------");
System.out.println("GAMING CONSOLE REPORT");
System.out.println("--------------------------------------------------");

// Display console column headers
System.out.printf("%-16s%-8s%-8s%-8s%n", "", consoles[0], consoles[1], consoles[2]);

// Loop through array to print sales and calculate total sales per city
for (int i = 0; i < cities.length; i++) {
System.out.printf("%-16s", cities[i]);
int rowTotal = 0;
for (int j = 0; j < sales[i].length; j++) {
System.out.printf("%-8d", sales[i][j]);
rowTotal += sales[i][j];
}
cityTotals[i] = rowTotal;
System.out.println();
}

System.out.println("--------------------------------------------------\n");

// --- DISPLAY OF CITY TOTALS AND MAXIMUM SALES ---
System.out.println("Total Console Sales For Each City");
System.out.println("--------------------------------------------------");

int maxSales = cityTotals[0];
int maxIndex = 0;

for (int i = 0; i < cities.length; i++) {
System.out.printf("%-16s%d%n", cities[i], cityTotals[i]);

// Determine city with highest sales
if (cityTotals[i] > maxSales) {
maxSales = cityTotals[i];
maxIndex = i;
}
}

System.out.println("\nCITY WITH THE MOST SALES: " + cities[maxIndex]);
System.out.println("--------------------------------------------------");
}
}
