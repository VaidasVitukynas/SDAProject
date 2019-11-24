package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
/*
public class WorkerMain {
    public static void main(String[] args) {
        List<Worker> workersList = ReadDataFromFile();
// daryti kaip sunis ar automobilius
        System.out.println("Vidutinis darbuotoju amzius: " + findAverageYearsOfWorker(workersList) + ",bei darbo uzmokesti" + findSalary(workersList));
        System.out.println("Daugiausiai uzdirbantis zmogus: " + findMostExpensivesWorker(workerList));
        System.out.println("Jauniausias darbuotojas: " + findTheYoungestWorker);
    }

    private static double findAverageYearsOfWorker(List<Worker> workersList) {
        double averageYear = 0;

        for (Worker worker : workersList) {
            averageYear += worker.getAge();
        }
        return averageYear / workersList.size();
    }

    private static double findSalary(List<Worker> workersList) {
        double salary = 0;

        for (Worker worker : workersList) {
            salary = worker.getSalary();
        }
        return salary / workersList.size();
    }

    private static double findMostExpensivesWorker(List<Worker> workersList) {
        double mostExpensivesWorker = workersList.get(0).getSalary();

        for (Worker worker : workersList) {
            if (mostExpensivesWorker < worker.getSalary()) {
                mostExpensivesWorker = worker.get.Salary();
                mostExpensivesWorkerName = worker.getName();
            }
        }

        return mostExpensivesWorkerName;
    }

    private static double findTheYoungestWorker(List<Worker> workersList) {
        double theYoungestWorker = workersList.get(0).getAge();

        for (Worker worker : workersList) {
            if (theYoungestWorker > worker.getAge()) {
                theYoungestWorker = worker.get.Age();
                theYoungestWorkerName = worker.getName();
            }
        }

        return theYoungestWorkerName;
    }
}
*/