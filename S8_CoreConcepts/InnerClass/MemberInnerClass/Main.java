package S8_CoreConcepts.InnerClass.MemberInnerClass;

import S8_CoreConcepts.InnerClass.MemberInnerClass.Example.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.shopStatus();
        shop.getLock().setLocking(false);//updated when Lock class is public 
        shop.shopStatus();
    }
}
