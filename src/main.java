import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] nhanVien = new NhanVien[4];
        nhanVien[0] = new NhanVien("sơn", 19977619, "Ha Noi");
        nhanVien[1] = new NhanVien("vinh", 19900889, "Ha Noi");
        nhanVien[2] = new NhanVien("sakura", 19888876, "Ha Noi");
        nhanVien[3] = new NhanVien("tokuda", 19999909, "Ha Noi");

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị nhân viên");
            System.out.println("4. Sửa thông tin nhân viên");
            System.out.println("5. Exit");
            System.out.println("mời nhập số đê");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    nhanVien = ContronlerNhanVien.creatNhanVien(nhanVien);
                    break;
                case 2:
                    nhanVien = ContronlerNhanVien.delete(nhanVien);
                    break;
                case 3:
                    ContronlerNhanVien.showNhanVien(nhanVien);
                    break;
                case 4:
                    nhanVien = ContronlerNhanVien.editNhanVien(nhanVien);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}