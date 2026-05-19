package DataStructureandAlgorithm.project;

import java.util.ArrayList;

public class SortingSearching {

    // Bubble Sort by Age
    public void bubbleSortByAge(ArrayList<Passenger> passengers) {

        for (int i = 0; i < passengers.size() - 1; i++) {

            for (int j = 0; j < passengers.size() - i - 1; j++) {

                if (passengers.get(j).getAge() >
                        passengers.get(j + 1).getAge()) {

                    Passenger temp = passengers.get(j);
                    passengers.set(j, passengers.get(j + 1));
                    passengers.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted by age using Bubble Sort.");
    }

    // Insertion Sort by Wallet
    public void insertionSortByWallet(ArrayList<Passenger> passengers) {

        for (int i = 1; i < passengers.size(); i++) {

            Passenger key = passengers.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    passengers.get(j).getWalletBalance() >
                    key.getWalletBalance()) {

                passengers.set(j + 1, passengers.get(j));
                j--;
            }

            passengers.set(j + 1, key);
        }

        System.out.println("Sorted by wallet using Insertion Sort.");
    }

    // Binary Search by ID
    public Passenger binarySearch(ArrayList<Passenger> passengers, int id) {

        int low = 0;
        int high = passengers.size() - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (passengers.get(mid).getPassengerId() == id) {
                return passengers.get(mid);
            }

            if (passengers.get(mid).getPassengerId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}