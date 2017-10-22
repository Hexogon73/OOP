package poly_1;

class Hunter {
    void giveShot(Animal a){
        System.out.println("Hunter shoots at in the " + a.getClass().getSimpleName());
        a.makeNoise();
        a.run();
    }
}
