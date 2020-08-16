package by.academy.lesson13;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}

		public void insertReverseNode(int nodeData) {
			DoublyLinkedListNode nodeNew = new DoublyLinkedListNode(nodeData);

			if (this.tail == null) {
				this.tail = nodeNew;
				this.tail.next = null;
			} else {
				this.head.prev = nodeNew;
				nodeNew.next = this.head;
			}

			this.head = nodeNew;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
		while (node != null) {
			System.out.print(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				System.out.print(sep);
			}
		}
	}

	public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

		if (head == null) {
			return null;
		} else {
			DoublyLinkedList a = new DoublyLinkedList();
			DoublyLinkedListNode node = head;
			while (node != null) {
				a.insertReverseNode(node.data);
				node = node.next;
			}
			return a.head;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		DoublyLinkedList llist = new DoublyLinkedList();

		int llistCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < llistCount; i++) {
			int llistItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			llist.insertNode(llistItem);
		}
		printDoublyLinkedList(llist.head, " ");
		System.out.println();
		DoublyLinkedListNode llist1 = reverse(llist.head);
		
		printDoublyLinkedList(llist1, " ");
		scanner.close();
	}
}
