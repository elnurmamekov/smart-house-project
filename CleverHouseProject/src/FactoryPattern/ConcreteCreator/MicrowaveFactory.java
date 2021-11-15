package FactoryPattern.ConcreteCreator;

import FactoryPattern.Factory.OvenFactory;
import FactoryPattern.Product.Oven;
import FactoryPattern.concreteProduct.Microwave;

public class MicrowaveFactory implements OvenFactory {

    @Override
    public Oven createOven() {
        return new Microwave();
    }
}
