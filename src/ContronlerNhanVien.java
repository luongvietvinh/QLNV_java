import java.util.Scanner;

public class ContronlerNhanVien {
    static Scanner scanner = new Scanner(System.in);

    public static void showNhanVien(NhanVien[] nhanVien) {
        for (NhanVien NV : nhanVien) {
            System.out.println(NV.toString());
        }
    }

    public static NhanVien[] creatNhanVien(NhanVien[] nhanVien) {
        NhanVien nhanvien = create();
        NhanVien[] newNV = new NhanVien[nhanVien.length + 1];
        for (int i = 0; i < nhanVien.length; i++) {
            newNV[i] = nhanVien[i];
        }
        newNV[newNV.length -1] = nhanvien;
        return newNV;
    }

    public static NhanVien[] delete(NhanVien[] nhanVien) {
        int index = findIndexById(nhanVien);
        if (index >= 0) {
            NhanVien[] nvNew = new NhanVien[nhanVien.length - 1];
            for (int i = 0; i < nhanVien.length - 1; i++) {
                if (i < index) {
                    nvNew[i] = nhanVien[i];
                } else {
                    nvNew[i] = nhanVien[i + 1];
                }

            }
            return nvNew;
        }
        return nhanVien;
    }


    public static NhanVien[] editNhanVien(NhanVien[] nhanVien) {
        int index = findIndexById(nhanVien);
        if (index >= 0) {
            NhanVien newNV = create();
            nhanVien[index].setName(newNV.getName());
            nhanVien[index].setNumber(newNV.getNumber());
            nhanVien[index].setAddress(newNV.getAddress());
        }
        return nhanVien;
    }


    public static NhanVien create() {
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập number");
        int number = scanner.nextInt();

        NhanVien NVien = new NhanVien(name, number, address);
        return NVien;
    }

    public static int findIndexById(NhanVien[] nhanVien) {
        System.out.println("nhập id muốn tìm");
        int id;
        id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanVien.length; i++) {
            if (id == nhanVien[i].getId()) {
                return i;
            }
        }
        return -1;
    }
}


