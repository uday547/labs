package com.deloitte.Lab04;

abstract class Item {
	
	private int identificationNumber;
    private String title;
    private int numberOfCopies;
    
    public Item(int id, String title, int copies) {
        this.identificationNumber = id;
        this.title = title;
        this.numberOfCopies = copies;
    }
        
        public int getIdentificationNumber() {
            return identificationNumber;
        }

        public String getTitle() {
            return title;
        }

        public int getNumberOfCopies() {
            return numberOfCopies;
        }
        public void checkIn() {
            numberOfCopies++;
        }

        public void checkOut() {
            if (numberOfCopies > 0) {
                numberOfCopies--;
            }
            }
            public void addItem(int additionalCopies) {
                numberOfCopies += additionalCopies;
            }

            @Override
            public String toString() {
                return "ID: " + identificationNumber + ", Title: " + title + ", Copies: " + numberOfCopies;
            }
    public abstract void print();
    
    

}
