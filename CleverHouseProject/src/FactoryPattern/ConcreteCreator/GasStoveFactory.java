package FactoryPattern.ConcreteCreator;

import FactoryPattern.Factory.OvenFactory;
import FactoryPattern.Product.Oven;
import FactoryPattern.concreteProduct.GasStove;

public class GasStoveFactory implements OvenFactory {
    @Override
    public Oven createOven() {
        return new GasStove();
    }
}
