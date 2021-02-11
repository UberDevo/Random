package me.uberdevo.random.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import org.bson.Document;

/**
 * @author UberDevo
 * Copyright @ UberDevo | All rights reserved
 */
public class MongoManager {

    @Getter
    private final MongoCollection<Document> profiles;

    public MongoManager(){
        MongoClient mongoClient = new MongoClient("localhost");
        MongoDatabase mongoDatabase = mongoClient.getDatabase("random");
        profiles = mongoDatabase.getCollection("profiles");
    }


}
