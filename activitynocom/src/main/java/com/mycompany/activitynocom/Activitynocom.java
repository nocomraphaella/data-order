/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activitynocom;
import java.util.Scanner;
/**
 *
 * @author CL3-PC30
 */
public class Activitynocom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p1,p2,p3;
        System.out.println("1 = Snacks");
        System.out.println("2 = Drinks");
        
        System.out.print("Enter your order: ");
        p1 = input.nextInt();

        
        if(p1==1)
        {
            System.out.println("[1]Sandwich - 40");
            System.out.println("[2]Burger - 12");
            System.out.println("[3]Fries - 12");
            
            System.out.print("Enter your order: ");
            p2 = input.nextInt();
            
            System.out.println("[1]Water - 15");
            System.out.println("[2]Sprite - 25");
            System.out.println("[3]Royal - 25");
            System.out.print("Enter your order: ");
            p2 = input.nextInt();
            
            if(p2==1 && p2==1)
            {
                System.out.println("Orders are Sandwich and Water");
            }
            else if(p2==1&&p2==2)
            {
                System.out.println("Orders are Sandwich and Sprite");
            }
            else if(p2==1&&p2==3)
            {
                System.out.println("Orders are chicharon and Royal");
            }
                        
            else if(p2==2&&p2==1)
            {
                System.out.println("Orders are Burger and Water");
            }            
            else if(p2==2&&p2==2)
            {
                System.out.println("Orders are Burger and Sprite");
            }            
            else if(p2==2&&p2==3)
            {
                System.out.println("Orders are Burger and Royal");
            }
            
            else if(p2==3&&p2==1)
            {
                System.out.println("Orders are Fries and Water");
            }            
            else if(p2==3&&p2==2)
            {
                System.out.println("Orders are Fries and Sprite");
            }            
            else if(p2==3&&p2==3)
            {
                System.out.println("Orders are Fries and Royal");
            }
            
            
            
        }
        else if(p1==2)
        {
            System.out.println("[1]Water - 15");
            System.out.println("[2]Sprite - 25");
            System.out.println("[3]Royal - 25");
            System.out.print("Enter your order: ");
            p3 = input.nextInt();
            
            System.out.println("[1]Sandwich - 40");
            System.out.println("[2]Burger - 12");
            System.out.println("[3]Fries - 12");
            
            System.out.print("Enter your order: ");
            p3 = input.nextInt();
            
            if(p3==1 && p3==1)
            {
                System.out.println("Orders are Water and Sandwich");
            }
            else if(p3==1&&p3==2)
            {
                System.out.println("Orders are Water and Burger");
            }
            else if(p3==1&&p3==3)
            {
                System.out.println("Orders are Water and Fries");
            }
            
            else if(p3==2&&p3==1)
            {
                System.out.println("Orders are Sprite and Sandwich");
            }            
            else if(p3==2&&p3==2)
            {
                System.out.println("Orders are Sprite and Burger");
            }            
            else if(p3==2&&p3==3)
            {
                System.out.println("Orders are Sprite and Fries");
            }
            
            else if(p3==3&&p3==1)
            {
                System.out.println("Orders are Royal and Sandwich");
            }            
            else if(p3==3&&p3==2)
            {
                System.out.println("Orders are Royal and Sandwich");
            }            
            else if(p3==3&&p3==3)
            {
                System.out.println("Orders are Royal and Sandwich");
            }
        }
        
        else
        {
            System.out.println("Cancelled order");
        }

    }
}
