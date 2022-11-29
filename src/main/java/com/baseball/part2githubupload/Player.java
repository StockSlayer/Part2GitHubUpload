package com.baseball.part2githubupload;
 /***********************************************************************************
 * Title: Player
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Player.java
 * Description: Abstract class for player creates a template for a player instance
 ***********************************************************************************/
public abstract class Player {

    // Attributes
     private String name;
     private String position;
//----------------------------------------------------------------------
     // noargs constructor
     public Player(){
         this.name="";
         this.position="";
     }

     // minimal constructor
     public Player(String name){
         this.name=name;
     }

     // Full constructor
     public Player(String name, String position){
         this.name=name;
         this.position=position;
     }
//----------------------------------------------------------------------
     // Setters
     public void setName(String name) {
         this.name = name;
     }

     public void setPosition(String position) {
         this.position = position;
     }
//----------------------------------------------------------------------
     //Getters
     public String getName() {
         return name;
     }

     public String getPosition() {
         return position;
     }
//----------------------------------------------------------------------
     // toString
     @Override
     public String toString(){
         String result = "";
         result += "Name= " + getName() + "\t" + "Position= " + getPosition();
         return result;
     }
//----------------------------------------------------------------------
     // Abstract methods
     public abstract String getAverage();
     public abstract String getERA();
//----------------------------------------------------------------------
    // Equals method for testing my array list contains method
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//
//         Player player = (Player) o;
//
//         if (!name.equals(player.name)) return false;
//         return position.equals(player.position);
//     }
//
//     @Override
//     public int hashCode() {
//         int result = name.hashCode();
//         result = 31 * result + position.hashCode();
//         return result;
//     }
 } // Player (class)
