
// Practice program: demonstrates a fixed-size queue for print jobs.
public class Printjob {
    // Simple fixed-size queue for print job IDs.
    private final int[] job;
    private int front;
    private int rear;
    private int size;

    public Printjob() {
        job = new int[20];
        front = 0;
        rear = -1;
        size = 0;
    }

    void addjob(int jobId) {
        if (size == job.length) {
            System.out.println("OVERFLOW");
            return;
        }

        rear = (rear + 1) % job.length;
        job[rear] = jobId;
        size++;
    }

    int removejob() {
        if (size == 0) {
            System.out.println("UNDERFLOW");
            return -1;
        }

        int removedJob = job[front];
        front = (front + 1) % job.length;
        size--;
        return removedJob;
    }

    void displayJobs() {
        // Print jobs in the same order in which they will be processed.
        for (int i = 0; i < size; i++) {
            int index = (front + i) % job.length;
            System.out.println(job[index]);
        }
    }

    public static void main(String args[]) {
        Printjob queue = new Printjob();
        queue.addjob(101);
        queue.addjob(102);
        queue.displayJobs();
        queue.removejob();
        queue.displayJobs();
    }
}
