interface Queue {
    // voeg een item toe aan de FIFO queue
    public void add(int value);
    // verwijder een item uit de FIFO queue
    public int remove(int index);
    // geef het eerste item in de FIFO queue terug, maar haal het er niet uit
    public int peek();
    // geef aan of de FIFO queue leeg is
    public boolean isEmpty();
    // geef de lengte van de FIFO queue terug
    public int size();
    // Print de inhoud van de FIFO queue
    public void print();
    // verwijder alle items uit de FIFO queue
    public void clear();
    // verwijder de eerste n items uit de FIFO queue
    public void clear(int n);
    // print de inhoud van de FIFO queue in omgekeerde volgorde
    public void printReverse();
    // plaats een element op een bepaalde positie in de FIFO queue
    public void jumpTheQueue(int n, int value);
    // Zet de FIFO queue om naar een String
    public String toString();
    // Kijk of de FIFO queue gelijk is aan een andere FIFO queue
    public boolean equals(Queue q);
    // Bepaal de index van een bepaalde waarde in de FIFO queue
    public int indexOf(int value);
    // bepaal de laatste index van een bepaalde waarde in de FIFO queue
    public int lastIndexOf(int value);
}
