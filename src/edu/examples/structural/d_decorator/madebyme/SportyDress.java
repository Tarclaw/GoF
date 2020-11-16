package edu.examples.structural.d_decorator.madebyme;

public class SportyDress extends DressDecorator {
    public SportyDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sporty Dress Features");
    }
}
