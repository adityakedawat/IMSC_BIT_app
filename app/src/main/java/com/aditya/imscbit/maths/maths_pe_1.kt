package com.aditya.imscbit.maths

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Syllabus
val modulespe11= arrayOf("Tensor Algebra: Preliminaries: systems of different orders, indicial and summation convention, Kronecker symbols. Introduction to tensors, n – dimensional space, transformation of coordinates, invariants, covariant vectors, contravariant vectors, second order contravariant, covariant and mixed tensors, Higher order tensors, Zero tensor, Tensor field. Addition and Subtraction of tensors, Equality of tensors, Symmetric and Skew Symmetric tensors, Contraction, Multiplication of tensors – Outer Product, Inner Product, Quotient Law, Conjugate (Reciprocal) tensors of second order. ",
    "Tensor Calculus: Line Element, Riemannian metric, fundamental metric tensor and its properties, Riemannian space, Conjugate (or reciprocal) of fundamental metric tensor, Associated Tensors, Length of a curve, Magnitude of a vector, Angle between vectors, Orthogonality. Christoffel symbols of first and second kind, Properties of Christoffel Symbols, Law of transformation of Christoffel symbols of first and second kind. ",
    "Covariant Differentiation: Covariant Differentiation of Covariant and Contravariant vectors, Covariant differentiation of second and higher order tensors, Properties of covariant differentiation, Ricci’s theorem, gradient, divergence and curl in tensorial forms, intrinsic derivative.",
    "Curvature Tensors: Riemann Christoffel tensor, Curvature tensor, properties of Riemann – Christoffel Curvature tensor, Bianchi identities, Ricci tensor, Riemannian curvature, Flat space, space of constant curvature, Einstein space, Einstein tensor. ",
    "Geodesics: Introduction to calculus of variations, Euler conditions, geodesics, differential equations of geodesics, Riemannian and geodesic coordinates, Parallelism, applications of tensor analysis.")
val refbookspe11= arrayOf(
    "1. Barry Spain, Tensor Calculus: A Concise Course, Dover Publications, New York, 2003. \n" +
            "2. David Kay, Schuam’s Outline of Tensor Calculus, Tata Mcgraw Hill Publishers, 2011. \n",
    "1. L.P. Eisenhart, Riemannian Geometry, Princeton University Press, 1949. \n" +
            "2. J.G. Simmonds, A Brief on Tensor Analysis, Springer - Verlag Publishers, 1982. \n")
val modulespe12= arrayOf("Introduction to Graphs: Definition of a Graph, Finite and Infinite Graphs, Incidence of vertices and edges, Types of Graphs, Sub Graphs, Digraphs, Bipartite Graphs, Isomorphism of Graphs, Degrees of Vertices, Handshaking Lemma, walks, Trail, Paths and Connectedness.",
    "Matrix representation of Graphs: Adjacency Matrix, Incidence Matrix. Connectivity: Cut vertex, Cut edge, Vertex connectivity, and Edge connectivity. ",
    "Eulerian Graphs, Hamiltonian Graphs, Necessary condition for Hamiltonian Graph, Ore’s Theorem, Dirac’s Theorem, Operations on Graphs: Union of Graphs, Intersection of Graphs and Join of Graphs. ",
    "Graph Colorings: Vertex Coloring, Chromatic number, Edge Coloring, Chromatic Index, Chromatic Polynomials. Planarity: Definition, Euler’s Formula and its consequences, Kuratowski’s Theorem and it’s applications. ",
    "Trees: Definition, Directed Tree, Rooted Tree, Binary Tree, Characterization and Simple Properties, Diameter of graph, Radius of graph, Center of graph, Spanning trees, Minimal Spanning trees, Kruskal’s, Prim’s and Dijkstra’s Algorithms. ")
val refbookspe12= arrayOf(
    "1. Arumugam, S. Invitation to graph theory. Scitech Publications Ind, 2006. \n" +
            "2. Balakrishnan, Rangaswami, and Kanna Ranganathan. A textbook of graph theory. Springer \n" +
            "\n" +
            "Science & Business Media, 2012. \n" +
            "3. West, Douglas Brent. Introduction to graph theory. Vol. 2. Upper Saddle River: Prentice hall, \n" +
            "\n" +
            "2001. \n" +
            "4. B. K. Sarkar, S. K. Chakraborty, Combinatorics and Graph Theory, Prentice Hall India Learning \n" +
            "\n" +
            "Private Limited, New Delhi, 2016. \n",
    "1. Harary, Frank. \"Graph theory”. 1969. \n" +
            "2. Bondy J. A. and Murty U. S. R., “Graph Theory”, Springer, 2011 \n" +
            "3. Deo N., “Graph Theory with Applications to Engineering and Computer Science”, Prentice Hall \n" +
            "\n" +
            "India, 2004 \n" +
            "4. Deistel R., “Graph Theory”, Springer (4th Ed.) 2010\n")
val modulespe13= arrayOf("Orthogonal Set of Functions: Introduction, Definitions, Orthogonal Functions, Gram-Schmidt Process\n" +
        "of Orthogolization, Orthogonality with respect to Weight Function, Orthonormal set of Functions with\n" +
        "respect to weight Function, Application of Orthogonality( Generalised Fourier Series and Fourier\n" +
        "constants), Sturm-Lioville Problem, Eigen Functions, Properties of Eigen-Function and Eigen values.\n",
    "Hypergeometric Functions: Introduction, Hypergeometric Differential Equation, Simple and Quadratic\n" +
            "Transformations of Hypergeometric Function, Generalised Hypergeometric Function, Integrals involving\n" +
            "Generalised Hypergeometric Function, Some Special Generalised Hypergeometric Functions.\n",
    "Hermite Polynomials: Introduction, Solution of Hermite’s Differential Equation, Hermite Polynomials,\n" +
            "Generating Function, Value of H n ( x ) and its Derivative at x \uF03D\uF0200 , Rodrigues Formula for ( ) n H x , First\n" +
            "Few Polynomials, Recurrence Relations for ( ) n H x , lntegral Representation of Hermite Polynomial,\n" +
            "Orthogonal Properties of ( ) n H x . \n",
    "Laguerre Polynomials: Introduction, Solution of Laguerre’s Differential Equation, Generating Function,\n" +
            "Generating Function, Rodrigues Formula for ( ) n L x , Recurrence Relations, Laguerre Polynomials for\n" +
            "particular values of n and x , Orthogonal Property of ( ) n L x , Integral relations of ( ) n L x .\n",
    "Chebyshev Polynomials: Introduction, Independent Solutions of Chebyshev’s Equation, Expansion of\n" +
            "( ) n T x and ( ) n U x , Generating Functions, Recurrence Relations, Evaluation of ( ) n T x and ( ) n U x for\n" +
            "given values of n , Orthogonal Properties of ( ) n T x and ( ) n U x , A brief Exposure of Advanced Special\n" +
            "Function like, Elliptic Functions, Mathieu Functions, Spheroidal Functions etc.\n")
val refbookspe13= arrayOf(
    "1. W. W. BELL , Special Functions For Scientists And Engineers , D. Van Nostrand Company Ltd,\n" +
            "1968\n" +
            "2. Nico M. Temme, Special Functions: An Introduction to the Classical Functions of Mathematical\n" +
            "Physics, John Wiley & Sons, Inc., 1996\n",
    "1. Special Functions and Their Applications. N. N. Lebedev. Translated from the revised Russian ed.\n" +
            "(Moscow, 1963) by Richard A. Silverman. Prentice-Hall, Englewood Cliffs, N.J., 1965.\n")
//val modulespe12= arrayOf("",
//    "",
//    "",
//    "",
//    "")
//val refbookspe12= arrayOf(
//    "",
//    "")


class maths_pe_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_pe_1)
        val button1 = findViewById<Button>(R.id.maths_pe1_sub1)
        val button2 = findViewById<Button>(R.id.maths_pe1_sub2)
        val button3 = findViewById<Button>(R.id.maths_pe1_sub3)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe11)
            intent.putExtra("books", refbookspe11)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe12)
            intent.putExtra("books", refbookspe12)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe13)
            intent.putExtra("books", refbookspe13)
            startActivity(intent)
        }
    }
}