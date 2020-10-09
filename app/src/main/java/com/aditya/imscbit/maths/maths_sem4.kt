package com.aditya.imscbit.maths

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Syllabus
val modules41= arrayOf("Mathematical logic and Mathematical Reasoning, Compound Statements, Propositional Equivalences, Predicates and Quantifiers, Methods of Proof, Mathematical Induction, Well-ordering principal, Recursive Definition and Algorithms.",
    "Recurrence Relations, Classification of Recurrence Relations and their solutions by Characteristic Root method, Generating function and their various aspects, Utility of Generating function in solving Recurrence Relations.",
    "Set, Operations on Set, Computer representation of Set, Relations, Properties/Classification of Relations, Closure operations on Relations, Matrix representation of Relations, Digraphs. Functions and their Representation, Classification of Functions, Warshall's algorithm, Discrete Numeric Functions, Growth of Functions, Big O , Big Θ , Hash Function, Growth Functions.",
    "Binary Operations, Groups, Product and Quotients of Groups, Semi group, Products and Quotients of Semi groups, Permutation Group, Composition of Permutation, Inverse Permutation, Cyclic Permutation, Transposition, Even and Odd Permutation, Coding of Binary Information and Error Correction, Decoding and Error Correction",
    "Introduction to Graph, Graph Terminologies and their Representation, Connected & Disconnected graphs, Isomorphic Graph, Euler & Hamilton graphs. Introduction to Trees, Versatility of Trees, Tree traversal. Spanning Trees, Minimum Spanning Tree.")
val refbooks41= arrayOf(
    "1. Mott, Joe L., Abraham Kandel, and Theodore P. Baker Discrete Mathematics for Computer Scientists & Mathematicians, PHI, 2nd edition 2002.\n" +
            "2. Swapan Kumar Chakraborty and Bikash Kanti Sarkar: Discrete Mathematics, Oxford Univ. Publication, 2010.\n" +
            "3. Kolman, Bernard, Robert C. Busby, and Sharon Ross. Discrete mathematical structures, Prentice-Hall, Inc., 2003.",
    "1. Bikash Kanti Sarkar and Swapan Kumar Chakraborty, Combinatorics and Graph Theory, PHI, 2016.\n" +
            "2. Seymour Lipschuz and Mark Lipson, Discrete Mathematics, Shaum’s outlines, 2003.\n" +
            "3. Liu, Chung Laung, Elements of Discrete mathematis, Mcgraw Hill, 2nd edition, 2001.\n" +
            "4. Bondy and Murty, Grapg Theory with Applications, American Elsevier,1979.\n" +
            "5. Robin J. Wilson, Introduction to Graph Theory, Pearson, 2010.")
val modules42= arrayOf("Vector spaces, subspaces, linear combination, linear span, spanning sets, linearly dependence and independence, Basis and dimension of a vector space, sums.",
    "Linear transformation (L.T.), kernel and image, rank-nullity theorem and its applications, singular and non-singular L.T, matrix representation of a linear transformation, change-of-basis (Transition) matrix.",
    "Eigenvalues and eigenvectors, characteristic and minimal polynomials. Eigenvalues of symmetric, skew symmetric, orthogonal and unitary matrices, Diagonalization and triangular form of matrices.",
    "Introduction to Jordan blocks and matrices in Jordon canonical form (examples only). An algorithm to find Jordan form of a square matrix (No proof). Inner product spaces over R (real numbers) and C (complex numbers), Norm of a vector, Schwarz’s Inequality, Triangle inequality.",
    "Orthogonality of vectors, orthogonal sets and basis, Parallelogram law, Bessel’s inequality, Gram-Schmidt orthogonalization process, Orthogonal projection.")
val refbooks42= arrayOf(
    "1. K.M. Hoffmann and R. Kunze: Linear Algebra, Pearson Education\n" +
            "2. Stephen H. Friedberg, Lawrence E. Spence, Arnold J. Insel: Linear Algebra, Pearson\n" +
            "3. Sheldon Axler: Linear Algebra Done Right, Springer\n" +
            "4. S. Lipschutz, M. L. Lipson: Schaum's Outline of Linear Algebra, McGraw-Hill",
    "1. Gilbert Strang: Introduction to Linear Algebra, Wellesley-Cambridge press\n" +
            "2. Shanti Narayan and P.K Mittal: A text book of Matrices, S. Chand.")
val modules43= arrayOf("Definition, classification of integral equation, types of kernels, solution of integral equation. Leibnitz’s rule of differentiation under integral sign, identity for converting multiple integral into single integral. Conversion of IVPs into Volterra integral equation, BVPs into Fredholm integral equation.",
    "Fredholm integral equations with separable (degenerate) kernels and its solution. Fredholm theorem. Eigenvalues and eigenfunctions of homogeneous Fredholm integral equation of second kind with separable or degenerate kernels",
    "Method of successive approximation: Iterated kernels, Resolvent kernel. Solution of Fredholm and Volterra equation of second kind by successive substitutions. (method of iteration). Solution of Fredholm and Volterra equation of second kind by successive approximations. Method of iteration. Neumann Series. Solution of Volterra integral equation by reducing into differential equation. Solution of Volterra integral equation of first kind.",
    "Symmetric kernel, orthonormal system of function, fundamental properties of eigenvalues and eigenfunctions for symmetric kernels, expansion of symmetric kernel in eigen function. Hilbert-Schmidt theorem, solution of symmetric integral equation by Hilbert- Schmidt theorem.",
    "Construction of Green’s function, existence and uniqueness theorem, conversion of BVPs into Fredholm integral equation and IVPs into Volterra integral equation by Green’s function. Solution of Volterra integral equation with convolution type kernel, integro-differential equation, Abel’s integral equation by Laplace and Fourier transform methods.")
val refbooks43= arrayOf(
    "1. David Porter, David S.G. Stirling: Integral Equation, Cambridge Texts in Applied Mathematics.\n" +
            "2. M.D. Raisinghania: Integral Equations and Boundary Value Problems, 2016.",
    "1. C. S. Manjarekar, Integral Equation, 2nd Edition, 2015.")
val modules44= arrayOf("Gaseous state: Kinetic theory of gas, Maxwell distribution equation, Ideal & real gases, compressibility\n" +
        "factor, Z. Van der Waals equation of state, Boyle temperature. Continuity of states, critical state, law of\n" +
        "corresponding states. Liquid state: Physical properties of liquids; vapour pressure, surface tension and\n" +
        "coefficient of viscosity. Solid state: Miller indices, symmetry elements and symmetry operations,\n" +
        "qualitative idea of point and space groups, seven crystal systems and fourteen Bravais lattices; X-ray\n" +
        "diffraction, Bragg’s law. Analysis of powder diffraction patterns ",
    "Strong, moderate and weak electrolytes, degree of ionization, ionization constant and ionic product of\n" +
            "water. Ionization of weak acids and bases, pH scale, common ion effect; dissociation constants of mono-,\n" +
            "di-and triprotic acids Salt hydrolysis-calculation of hydrolysis constant, degree of hydrolysis and pH for\n" +
            "different salts. Buffer solutions; derivation of Henderson equation and its applications. Solubility and\n" +
            "solubility product of sparingly soluble salt. Qualitative treatment of acid – base titration curves. Theory\n" +
            "of acid–bases; Arrhenius, Bronsted Lowry, Lewis concept, SHAB, solvent systems; selection of\n" +
            "indicators and their limitations. Hydrolysis and hydrolysis constants. ",
    "Aromaticity: Hückel’s rule, aromatic character of arenes, cyclic carbocations/carbanions and heterocyclic\n" +
            "compounds with suitable adityas. Electrophilic aromatic substitution: Isotopic effect, halogenation,\n" +
            "nitration, sulphonation and Friedel-Craft’s alkylation/acylation with their mechanism & energy diagram,.\n" +
            "Directing effects of the groups. ",
    "Galvanic cells and electrolytic cells, Daniel cell, different kind of half-cells, electromotive forces of a cell\n" +
            "and its measurement, Nernst equation, Redox equilibrium, Standard Electrode Potential and its\n" +
            "application to inorganic reactions, different types of galvanic cells, Thermodynamics of electrochemical\n" +
            "cells and applications, Potentiometric titrations to determine various equilibrium constants. ",
    "Carbon-Carbon sigma bonds: Chemistry of alkanes, Wurtz Reaction, Wurtz-Fittig Reactions, Free radical\n" +
            "substitutions: Halogenation. Carbon-Carbon pi bonds: elimination reactions, Mechanism of E1, E2, E1cb\n" +
            "reactions. Saytzeff and Hofmann eliminations. Reactions of alkenes: Electrophilic additions their\n" +
            "mechanisms (Markownikoff/Anti Markownikoff addition), mechanism of oxymercurationdemercuration, hydroboration-oxidation, ozonolysis, reduction (catalytic and chemical), syn and antihydroxylation (oxidation). 1,2-and 1,4-addition reactions in conjugated dienes and, Diels-Alder reaction;\n" +
            "Allylic and benzylic bromination and mechanism, e.g. propene, 1-butene, toluene, ethyl benzene.\n" +
            "Reactions of alkynes: Acidity, Electrophilic and Nucleophilic additions. Hydration to form carbonyl\n" +
            "compounds, Alkylation of terminal alkynes. Alkanes & Cycloalkanes: Types, Conformational Analysis,\n" +
            "relative stability & Energy diagrams. ")

val refbooks44= arrayOf(
    "1. Kapoor, K. L. A Textbook of Physical Chemistry, Volume 1, Mcmillan Publishers India Ltd,\n" +
            "2004\n" +
            "2. Atkins, P. W. & Paula, J. de Atkin’s Physical Chemistry 10th Ed., Oxford University Press\n" +
            "(2014).\n" +
            "3. Castellan, G. W. Physical Chemistry 4th Ed. Narosa (2004).\n" +
            "4. Finar, I. L. Organic Chemistry (Volume 1), Dorling Kindersley (India) Pvt. Ltd. (Pearson\n" +
            "Education).\n" +
            "5. Morrison, R. N. & Boyd, R. N. Organic Chemistry, Dorling Kindersley (India) Pvt. Ltd. (Pearson\n" +
            "Education). \n",
    "1. Ball, D. W. Physical Chemistry Thomson Press, India (2007).\n" +
            "2. Mortimer, R. G. Physical Chemistry 3rd Ed. Elsevier: NOIDA, UP (2009).\n" +
            "3. Engel, T. & Reid, P. Physical Chemistry 3rd Ed. Pearson (2013).\n" +
            "4. McMurry, J.E. Fundamentals of Organic Chemistry, 7th Ed. Cengage Learning India Edition,\n" +
            "2013. \n")
val modules45= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks45= arrayOf(
    "",
    "")

class maths_sem_4 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.maths_sem_4, container, false)
        val button1 = view.findViewById<Button>(R.id.msem4_sub1)
        val button2 = view.findViewById<Button>(R.id.msem4_sub2)
        val button4 = view.findViewById<Button>(R.id.msem4_sub4)
        val button3 = view.findViewById<Button>(R.id.msem4_sub3)
        val button5=view.findViewById<Button>(R.id.msem4_sub5)

        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules41)
            intent.putExtra("books", refbooks41)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules42)
            intent.putExtra("books", refbooks42)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules44)
            intent.putExtra("books", refbooks44)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules43)
            intent.putExtra("books", refbooks43)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules45)
            intent.putExtra("books", refbooks45)
            startActivity(intent)
        }

        return view
    }

    companion object {

        fun newInstance(): maths_sem_4 =
            maths_sem_4()
    }
}