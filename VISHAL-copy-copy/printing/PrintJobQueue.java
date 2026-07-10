/**
 * A fixed‑size circular queue for managing print job IDs.
 * <p>
 * The queue uses a circular array internally, giving O(1) time complexity
 * for both {@code addJob} and {@code removeJob} (amortized constant time,
 * with no resizing). The display operation iterates through the current
 * elements in FIFO order, taking O(n) where n is the current size.
 * </p>
 */
public class PrintJobQueue {

    /** Default capacity of the queue if none is specified. */
    private static final int DEFAULT_CAPACITY = 20;

    /** The circular array holding the job IDs. */
    private final int[] jobs;

    /** Index of the front element (next to be removed). */
    private int front;

    /** Index of the rear element (last added). */
    private int rear;

    /** Current number of jobs in the queue. */
    private int size;

    /** Maximum number of jobs the queue can hold. */
    private final int capacity;

    /**
     * Creates a print job queue with the default capacity of 20.
     */
    public PrintJobQueue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates a print job queue with a specified capacity.
     *
     * @param capacity maximum number of jobs the queue can hold; must be positive
     * @throws IllegalArgumentException if capacity is non‑positive
     */
    public PrintJobQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive, got: " + capacity);
        }
        this.capacity = capacity;
        this.jobs = new int[capacity];
        front = 0;
        rear = -1;          // indicates empty queue (rear will wrap around on first add)
        size = 0;
    }

    /**
     * Adds a new print job to the rear of the queue.
     * <p>
     * Time Complexity: O(1)
     * </p>
     *
     * @param jobId the job identifier to enqueue
     * @throws IllegalStateException if the queue is full (overflow)
     */
    public void addJob(int jobId) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow: cannot add job " + jobId
                    + " because the queue is full (capacity " + capacity + ")");
        }
        rear = (rear + 1) % capacity;
        jobs[rear] = jobId;
        size++;
    }

    /**
     * Removes and returns the print job at the front of the queue.
     * <p>
     * Time Complexity: O(1)
     * </p>
     *
     * @return the job ID that was removed
     * @throws IllegalStateException if the queue is empty (underflow)
     */
    public int removeJob() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow: cannot remove from an empty queue");
        }
        int removedJob = jobs[front];
        front = (front + 1) % capacity;
        size--;
        return removedJob;
    }

    /**
     * Displays all jobs currently in the queue, from front to rear (FIFO order).
     * Each job ID is printed on its own line.
     * <p>
     * Time Complexity: O(n) where n is the current number of jobs.
     * </p>
     */
    public void displayJobs() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.println(jobs[index]);
        }
    }

    /**
     * Checks whether the queue is empty.
     *
     * @return {@code true} if the queue contains no jobs
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the queue is full.
     *
     * @return {@code true} if the queue has reached its capacity
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Returns the current number of jobs in the queue.
     *
     * @return the queue size
     */
    public int size() {
        return size;
    }

    /**
     * Simple demonstration of the print job queue.
     */
    public static void main(String[] args) {
        PrintJobQueue queue = new PrintJobQueue();   // default capacity 20

        // Add some jobs
        queue.addJob(101);
        queue.addJob(102);
        queue.addJob(103);

        System.out.println("Jobs after adding 101, 102, 103:");
        queue.displayJobs();

        // Remove one job
        int processed = queue.removeJob();
        System.out.println("Processed job: " + processed);

        System.out.println("Remaining jobs:");
        queue.displayJobs();

        // Try to remove from empty queue to see exception (optional)
        // queue.removeJob();  // would throw IllegalStateException
    }
}