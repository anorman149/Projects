public class Main {

    public static void main(String[] args) {
        LargeObjectCache.loadCache();

        for(int x=0; x<4; x++){
            System.out.println(LargeObjectCache.getLargeObject(x).getId());
        }
    }
}
