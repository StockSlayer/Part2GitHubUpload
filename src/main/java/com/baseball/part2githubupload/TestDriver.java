package com.baseball.part2githubupload;
/***********************************************************************************
 * Title: TestDriver
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: TestDriver.java
 * Description: testing class to test different methods and functions for my program
 ***********************************************************************************/
public class TestDriver {
    public static void main(String[] args){
        Player[] hitters = {
                new Hitter("Adley Rutschman"," C", 101, 398),
                new Hitter("Gunner Henderson","3B", 30, 116),
                new Hitter("Cedric Mullins ","CF",157, 608),
                new Hitter("Ryan Mountcastle","1B", 139, 555)};

        SortingUtility.mergeSort(hitters, new HitterAverageComparator());
        printArray(hitters);

        System.out.println("--------------------------------------------");

        Player[] pitchers = {
                new Pitcher("Dean Kramer\t","SP", 45, 125.1),
                new Pitcher("Kyle Bradish\t","SP", 64, 117.2),
                new Pitcher("Felix Bautista","RP", 16, 65.2)};

        SortingUtility.mergeSort(pitchers, new ERAComparator());
        printArray(pitchers);
//------------------------------------------------------------------------------
        //Testing PlayerDoublyLinkedList
        // Hitters
        Player adely = new Hitter("Adley Rutschman\t"," C\t", 101, 398);
        Player gunner = new Hitter("Gunner Henderson\t","3B\t", 30, 116);
        Player cedric = new Hitter("Cedric Mullins\t","CF\t",157, 608);
        Player mountie = new Hitter("Ryan Mountcastle\t","1B\t", 139, 555);
        Player tony = new Hitter("Anthony Santander\t", "RF\t", 138, 574);
        Player stowers = new Hitter("Kyle Stowers\t", "OF\t", 23, 91);
        Player vavra = new Hitter("Terrin Vavra\t", "UT\t", 23, 89);
        Player mckenna = new Hitter("Ryan McKenna\t", "OF\t", 37, 156);
        Player hays = new Hitter("Austin Hays\t", "LF\t", 134, 535);
        Player urias = new Hitter("Ramon Urias\t", "3B\t", 100, 403);
        Player mateo = new Hitter("Jorge Mateo\t", "SS\t", 109, 494);
        Player odor = new Hitter("Rougned Odor\t", "2B\t", 88, 426);
        // Starters
        Player lyles = new Pitcher("Jorden Lyles", "SP", 88, 179.0);
        Player kremer = new Pitcher("Dean Kremer", "SP", 45, 125.1);
        Player bradish = new Pitcher("Kyle Bradish", "SP", 64, 117.2);
        Player watkins = new Pitcher("Spencer Watkins", "SP", 55, 105.1);
        Player wells = new Pitcher("Tyler Wells", "SP", 49, 103.2);
        Player voth = new Pitcher("Austin Voth", "SP", 28, 83.0);
        // Bullpen
        Player tate = new Pitcher("Dylan Tate", "RP", 25, 73.2);
        Player baker = new Pitcher("Bryan Baker", "RP", 27, 69.2);
        Player felix = new Pitcher("Felix Bautista","CL", 16, 65.2);
        Player perez = new Pitcher("Cionel Perez", "RP", 9, 57.2);
        Player hall = new Pitcher("DL Hall", "RP", 9, 13.2);

//        Player billEnd = new Hitter("Bill End\t\t", "BB", 5, 10);
        PlayerLinkedList list = new PlayerLinkedList();

        list.addToFront(adely);
        list.addToFront(gunner);
        list.addToFront(cedric);
        list.addToFront(mountie);
        list.addToFront(tony);
        list.addToFront(stowers);
        list.addToFront(vavra);
        list.addToFront(mckenna);
        list.addToFront(mateo);
        list.addToFront(urias);
        list.addToFront(hays);
        list.addToFront(odor);

        list.printList();
        System.out.println(list.getSize());

        LinkedStack pitcherList = new LinkedStack();
        pitcherList.push(lyles);
        pitcherList.push(kremer);
        pitcherList.push(bradish);
        pitcherList.push(watkins);
        pitcherList.push(wells);
        pitcherList.push(voth);

        pitcherList.push(tate);
        pitcherList.push(baker);
        pitcherList.push(felix);
        pitcherList.push(perez);
        pitcherList.push(hall);

        pitcherList.printStack();

//        Player[] batter = list.toArray();
//        SortingUtility.mergeSort(batter, new HitterAverageComparator());
//        printArray(batter);
//        for (Player player : batter) {
//            System.out.println(player);
//        }

    } // main
    public static<T> void printArray(T []a){
        for(T t : a){
            System.out.println(t);
        }
    }// GenericPrintArray
} // TestDriver
