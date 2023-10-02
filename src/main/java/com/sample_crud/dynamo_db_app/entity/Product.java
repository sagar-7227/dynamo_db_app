package com.sample_crud.dynamo_db_app.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@DynamoDBTable(tableName = "products") // validates if the DynamoDB table exists or not.DynamoDB does not create collection automatically so it is important to create dynamodb before hand 

@Data
public class Product {

    @DynamoDBHashKey(attributeName = "id") //marking a property as the hash key for a modeled class
    @DynamoDBAutoGeneratedKey              //for making the hashkey property to autogenerate the key & it supports String type only
    private String id;

    @DynamoDBAttribute(attributeName = "name") //Maps a property to dynamodb table attribute. 
    private String productName;

    @DynamoDBAttribute(attributeName = "category")
    private String category;

    @DynamoDBAttribute(attributeName = "price")
    private float price;


}
