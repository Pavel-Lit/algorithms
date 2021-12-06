public class MySort {

    public static void fullSort(Notebook[] arr){
        sortPrice(arr);
        sortRam(arr);
        sortManufacture(arr);
    }
    private static void sortManufacture(Notebook[] arr){
        int startIndex = 0;
        int endIndex = 0;
        int i = 0;
        int maxSize = arr.length - 1;
        while (i != arr.length) {
            boolean isCompare = false;
            if (i == maxSize) {
                endIndex = maxSize;
                boolean isChange;
                do {
                    isChange = false;
                    for (int j = startIndex; j < endIndex; j++) {
                        if (arr[j].getManufacturer().ordinal() > arr[j + 1].getManufacturer().ordinal()) {
                            Notebook temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            isChange = true;
                        }
                    }
                } while (isChange);
                i++;
            } else {
                if (arr[i].getRam() == arr[i + 1].getRam()) {
                    endIndex++;
                    i++;
                    isCompare = true;
                } else {
                    if (startIndex == endIndex) {
                        i++;
                        startIndex = i;
                        endIndex = i;
                        continue;
                    }
                    boolean isChange;
                    i++;
                    do {
                        isChange = false;

                        for (int j = startIndex; j < endIndex; j++) {
                            if (arr[j].getManufacturer().ordinal() > arr[j + 1].getManufacturer().ordinal()) {
                                Notebook temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                                isChange = true;
                            }
                        }
                    } while (isChange);
                }
                if (!isCompare) {
                    startIndex = i;
                    endIndex = i;
                }
            }
        }


    }
    private static void sortPrice(Notebook[] arr) {
        boolean isChange;
        do {
            isChange = false;

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].getPrice() > arr[j + 1].getPrice()) {
                    Notebook temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isChange = true;
                }
            }
        } while (isChange);

    }


    private static void sortRam(Notebook[] arr) {
        int startIndex = 0;
        int endIndex = 0;
        int i = 0;
        int maxSize = arr.length - 1;
        while (i != arr.length) {
            boolean isCompare = false;
            if (i == maxSize) {
                endIndex = maxSize;
                boolean isChange;
                do {
                    isChange = false;
                    for (int j = startIndex; j < endIndex; j++) {
                        if (arr[j].getRam() > arr[j + 1].getRam()) {
                            Notebook temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            isChange = true;
                        }
                    }
                } while (isChange);
                i++;
            } else {
                if (arr[i].getPrice() == arr[i + 1].getPrice()) {
                    endIndex++;
                    i++;
                    isCompare = true;
                } else {
                    if (startIndex == endIndex) {
                        i++;
                        startIndex = i;
                        endIndex = i;
                        continue;
                    }
                    boolean isChange;
                    i++;
                    do {
                        isChange = false;

                        for (int j = startIndex; j < endIndex; j++) {
                            if (arr[j].getRam() > arr[j + 1].getRam()) {
                                Notebook temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                                isChange = true;
                            }
                        }
                    } while (isChange);
                }
                if (!isCompare) {
                    startIndex = i;
                    endIndex = i;
                }
            }
        }

    }
}
