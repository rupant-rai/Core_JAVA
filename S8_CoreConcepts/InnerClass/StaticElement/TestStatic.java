package S8_CoreConcepts.InnerClass.StaticElement;

public class TestStatic {

    // public int staticVar=0;

    // public int getStaticVar() {
    //     return staticVar;
    // }

    // public void setStaticVar(int staticVar) {
    //     this.staticVar = staticVar;
    //}

    public static int staticVar=0;

    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        TestStatic.staticVar = staticVar;
    }
}
