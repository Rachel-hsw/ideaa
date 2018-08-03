import java.io.File;

public class CheckRoot {
    public static void main(String[] args) {
        System.out.println(isRoot()+"hhh" );
    }
    /**
     * 判断手机是否ROOT
     */
    public static boolean isRoot() {

        boolean root = false;

        try {
            if ((!new File("/system/bin/su").exists())
                    && (!new File("/system/xbin/su").exists())) {
                root = false;
            } else {
                root = true;
            }

        } catch (Exception e) {
        }

        return root;
    }
}
