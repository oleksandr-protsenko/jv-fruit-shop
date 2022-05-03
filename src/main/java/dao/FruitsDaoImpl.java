package dao;

import db.Storage;
import model.Fruit;

public class FruitsDaoImpl implements FruitsDao {
    @Override
    public void addProduct(Fruit fruit, Integer count) {
        Storage.storage.put(fruit, count);
    }

    @Override
    public Integer getValue(Fruit fruit) {
        return Storage.storage.get(fruit);
    }
}