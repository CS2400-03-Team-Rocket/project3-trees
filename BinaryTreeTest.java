import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class BinaryTreeTest extends BinaryTree
{
    @Test
    public void testPostorderTraverse()
    {

        BinaryTree<Integer> mockBinaryTree = new BinaryTree<>();
        // Leaves
		BinaryTree<Integer> dTree = new BinaryTree<>(4);
		BinaryTree<Integer> eTree = new BinaryTree<>(5);
		BinaryTree<Integer> gTree = new BinaryTree<>(7);

		// Subtrees:
		BinaryTree<Integer> fTree = new BinaryTree<>(6, null, gTree);
		BinaryTree<Integer> bTree = new BinaryTree<>(2, dTree, eTree);
		BinaryTree<Integer> cTree = new BinaryTree<>(3, fTree, null);

		mockBinaryTree.setTree(1, bTree, cTree);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        mockBinaryTree.postorderTraverse();
        //4527631
        assertEquals("4527631", outContent.toString());
    }

    @Test
    public void testPostorderTraverse_callBinaryNodeMethod()
    {
        BinaryTree<Integer> mockBinaryTree = new BinaryTree<>();
        // Leaves
		BinaryTree<Integer> dTree = new BinaryTree<>(4);
		BinaryTree<Integer> eTree = new BinaryTree<>(5);
		BinaryTree<Integer> gTree = new BinaryTree<>(7);

		// Subtrees:
		BinaryTree<Integer> fTree = new BinaryTree<>(6, null, gTree);
		BinaryTree<Integer> bTree = new BinaryTree<>(2, dTree, eTree);
		BinaryTree<Integer> cTree = new BinaryTree<>(3, fTree, null);

		mockBinaryTree.setTree(1, bTree, cTree);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        mockBinaryTree.postorderTraverse_callBinaryNodeMethod();
        
        //4527631
        assertEquals("4527631", outContent.toString());

    }

    @Test
    public void testGetHeight()
    {

        BinaryTree<Integer> mockBinaryTree = new BinaryTree<>();
        // Leaves
		BinaryTree<Integer> dTree = new BinaryTree<>(4);
		BinaryTree<Integer> eTree = new BinaryTree<>(5);
		BinaryTree<Integer> gTree = new BinaryTree<>(7);

		// Subtrees:
		BinaryTree<Integer> fTree = new BinaryTree<>(6, null, gTree);
		BinaryTree<Integer> bTree = new BinaryTree<>(2, dTree, eTree);
		BinaryTree<Integer> cTree = new BinaryTree<>(3, fTree, null);

		mockBinaryTree.setTree(1, bTree, cTree);

        int expected = 4;

        int output = mockBinaryTree.getHeight();
        //height = 4
        assertEquals(expected, output);
    }

    @Test
    public void testGetHeightBinaryNodeMethod()
    {

        BinaryTree<Integer> mockBinaryTree = new BinaryTree<>();
        // Leaves
		BinaryTree<Integer> dTree = new BinaryTree<>(4);
		BinaryTree<Integer> eTree = new BinaryTree<>(5);
		BinaryTree<Integer> gTree = new BinaryTree<>(7);

		// Subtrees:
		BinaryTree<Integer> fTree = new BinaryTree<>(6, null, gTree);
		BinaryTree<Integer> bTree = new BinaryTree<>(2, dTree, eTree);
		BinaryTree<Integer> cTree = new BinaryTree<>(3, fTree, null);

		mockBinaryTree.setTree(1, bTree, cTree);

        int expected = 4;

        int output = mockBinaryTree.getHeight_callBinaryNodeMethod();
        //height = 4
        assertEquals(expected, output);
    }

    @Test
    public void testGetNumberOfNodes()
    {

        BinaryTree<Integer> mockBinaryTree = new BinaryTree<>();
        // Leaves
		BinaryTree<Integer> dTree = new BinaryTree<>(4);
		BinaryTree<Integer> eTree = new BinaryTree<>(5);
		BinaryTree<Integer> gTree = new BinaryTree<>(7);

		// Subtrees:
		BinaryTree<Integer> fTree = new BinaryTree<>(6, null, gTree);
		BinaryTree<Integer> bTree = new BinaryTree<>(2, dTree, eTree);
		BinaryTree<Integer> cTree = new BinaryTree<>(3, fTree, null);

		mockBinaryTree.setTree(1, bTree, cTree);

        int expected = 7;

        int output = mockBinaryTree.getNumberOfNodes();
        //nodes = 7
        assertEquals(expected, output);
    }

    @Test
    public void testGetNumberOfNodesBinaryNodeMethod()
    {

        BinaryTree<Integer> mockBinaryTree = new BinaryTree<>();
        // Leaves
		BinaryTree<Integer> dTree = new BinaryTree<>(4);
		BinaryTree<Integer> eTree = new BinaryTree<>(5);
		BinaryTree<Integer> gTree = new BinaryTree<>(7);

		// Subtrees:
		BinaryTree<Integer> fTree = new BinaryTree<>(6, null, gTree);
		BinaryTree<Integer> bTree = new BinaryTree<>(2, dTree, eTree);
		BinaryTree<Integer> cTree = new BinaryTree<>(3, fTree, null);

		mockBinaryTree.setTree(1, bTree, cTree);

        int expected = 7;

        int output = mockBinaryTree.getNumberOfNodes_callBinaryNodeMethod();
        //nodes = 7
        assertEquals(expected, output);
    }
}
