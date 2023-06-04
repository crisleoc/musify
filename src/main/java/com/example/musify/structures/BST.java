package com.example.musify.structures;

import com.example.musify.classes.Song;

public class BST {
    private Node root;

    private class Node {
        private Song song;
        private Node left;
        private Node right;

        public Node(Song song) {
            this.song = song;
            this.left = null;
            this.right = null;
        }
    }

    public BST() {
        this.root = null;
    }

    public void insert(Song song) {
        root = insertHelper(root, song);
    }

    private Node insertHelper(Node node, Song song) {
        if (node == null) {
            return new Node(song);
        }

        if (song.getId() < node.song.getId()) {
            node.left = insertHelper(node.left, song);
        } else if (song.getId() > node.song.getId()) {
            node.right = insertHelper(node.right, song);
        }

        return node;
    }

    public Song search(int id) {
        return searchHelper(root, id);
    }

    private Song searchHelper(Node node, int id) {
        if (node == null || node.song.getId() == id) {
            return (node != null) ? node.song : null;
        }

        if (id < node.song.getId()) {
            return searchHelper(node.left, id);
        }

        return searchHelper(node.right, id);
    }

    public void inorderTraversal() {
        inorderTraversalHelper(root);
    }

    private void inorderTraversalHelper(Node node) {
        if (node != null) {
            inorderTraversalHelper(node.left);
            System.out.println(node.song.getTitle());
            inorderTraversalHelper(node.right);
        }
    }
}
