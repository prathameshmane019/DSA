// 118. Pascal's Triangle
// Easy
// Topics
// Companies
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

// Constraints:

// 1 <= numRows <= 30

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    /**
     * This method generates the first numRows of Pascal's triangle.
     * 
     * @param numRows The number of rows of Pascal's triangle to generate.
     * @return A list of lists of integers representing the first numRows of Pascal's triangle.
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case; the first row is always [1]
        if (numRows == 0) {
            return triangle;
        }

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Generate each row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            // The first element of each row is always 1
            row.add(1);

            // Each element is the sum of the two elements directly above it
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last element of each row is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int numRows = 5;
        List<List<Integer>> result = pt.generate(numRows);

        // Print the generated Pascal's triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
