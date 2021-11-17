package FactoryPattern.concreteCreator;

import FactoryPattern.factory.OvenFactory;
import FactoryPattern.product.Oven;
import FactoryPattern.concreteProduct.GasStove;

public class GasStoveFactory implements OvenFactory {
    @Override
    public Oven createOven() {
        return new GasStove();
    }
}
