/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ratelimiteralgo.algorithms;

/**
 *
 * @author kristel
 */
public class LeakyBucket {
    
    public static void main (String [] args){
        leakyBucket(4);
    }

    private static void leakyBucket(int noOfQueries){
        //how much the bucket holds
        int bucketValue = 10;

        //how much there is already in the bucket
        int storage = 0;

        //space left in the bucket
        int sizeLeft = 0;

        //number of packets that enter at the same time
        int inputPackets = 4;

        //packets leaving every round the bucket
        int outOfBucket = 1;

        // noOfQueries: number of times we check the bucket
        for (int i = 0; i < noOfQueries; i++){
            sizeLeft = bucketValue - storage;
            if (inputPackets < sizeLeft){
                storage += inputPackets;            
                System.out.println("Buffer size : " + storage + "out of bucket size " + bucketValue);
            } else {
                System.out.println("Lost packets: " + (inputPackets - sizeLeft));
                storage = bucketValue;
            }
            storage -= outOfBucket;

        } 
    }
}
