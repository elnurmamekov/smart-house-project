package FactoryPattern.concreteCreator;

import FactoryPattern.factory.OvenFactory;
import FactoryPattern.product.Oven;
import FactoryPattern.concreteProduct.Microwave;

public class MicrowaveFactory implements OvenFactory {

    @Override
    public Oven createOven() {
        return new Microwave();
    }
}
