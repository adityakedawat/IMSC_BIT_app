package com.aditya.imscbit.maths

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Syllabus
val modulespe21= arrayOf("Basic concept of a linear system of equations. Direct methods: Gauss elimination method, partial and complete pivoting, Gauss-Jordan method, LU decompositions, Cholesky method, Partition method, Vector and matrix norms, condition numbers, estimating condition numbers, significant digit, floating point arithmetic, analysis of round off errors. ",
    "Iterative methods: General iteration method, Jacobi and Gauss-Seidel iteration methods, Successive over relation method (SOR), convergence analysis of iterative methods and optimal relaxation parameter for the SOR method.",
    "Gram-Schmidt orthonormal process, orthogonal matrices, Householder transformation, Givens rotations, QR factorization, round off error analysis of orthogonal matrices, stability of QR factorization.",
    "Solution of linear least squares problems, singular value decomposition (SVD), polar decomposition, Moore-Penrose inverse and rank deficient least squares problems. Reduction to Heisenberg and tri-diagonal forms. ",
    "Eigen values and Eigen vectors: Bounds on eigenvalues, Gerschgorin bounds, Jacobi, Givens, Householder’s methods for symmetric matrices. Dominant and smallest Eigen values/Eigen vectors by power method, Rayleigh quotient iteration, explicit and implicit QR algorithms for symmetric and non-symmetric matrices, implementation of implicit QR algorithm, computing the SVD, sensitivity analysis of singular values and singular vectors, the Arnoldi and the Lanczos iterations. ")
val refbookspe21= arrayOf(
    "1. G.W. Stewart: Introduction to Matrix Computations, Academic Press \n" +
            "2. M.K. Jain, S.R.K. Iyengar, R.K. Jain: Numerical Methods, Problems and Solutions, New Age \n" +
            "\n" +
            "International \n" +
            "3. S.S. Sastry: Introductory Methods of Numerical Analysis, PHI learning . \n" +
            "4. C. L. Byrne: Applied and Computational Linear Algebra, A First Course, CRC \n",
    "1. G.H. Golub, C.F.Van Loa: Matrix Computation, John Hopkins U. Press, Baltimore \n" +
            "2. J.W. Demmel: Applied Numerical Linear Algebra, SIAM, Philadelphia \n" +
            "3. D.S. Watkins: Fundamentals of Matrix Computations, Willey\n")
val modulespe22= arrayOf("The Difference Calculus: Genesis of difference equations, Definitions, derivation of difference equations, existence and uniqueness theorem, Operators Δ and E, Elementary difference operators, factor polynomials, Operator Δ-1 and the sum calculus.",
    "First Order difference equations: Introduction, General linear equations with examples, equations of the forms yk+1=Rkyk and yk+1-yk=(n+1)kn with examples, Continued fractions, A general first-order equations: Geometrical methods and expansion techniques. ",
    "Linear Difference equations: Introduction, Linearly dependent functions, fundamental theorem for homogeneous equations, Inhomogeneous equations, second order equations, Sturm-Liouville difference equations. ",
    "Linear Difference equations (Contd…): Homogeneous equations: Construction of difference equation having specified solutions, relationship between linear difference and differential equations. \n" +
            "Inhomogeneous equations: Method of undetermined coefficients and separation method. \n" +
            "The z-transform method. \n",
    "Linear Partial Difference equations: Introduction, symbolic methods, Lagrange’s and separation of variables, Laplace method, Particular solution, Simultaneous equations with constant coefficients.")
val refbookspe22= arrayOf(
    "1. R. E. Mickens, Difference Equations: Theory, Applications and Advanced Topics, CRC Press, Third Edition, 2015.",
    "1. W. G. Kelley and Allan C. Peterson, Difference Equations: An Introduction with Applications, Academic Press, Second Edition, 2001 \n" +
            "2. Saber Elaydi, An Introduction to Difference Equations, Third Edition, Springer, New York, 2005. \n" +
            "3. Kenneth S. Miller, An Introduction to the Calculus of Finite Differences and Difference Equations, Dover Publications, New York, 1960.\n")
val modulespe23= arrayOf("Introduction: Introduction to “Large‐Scale”distributed systems, Consequences of “large‐scale”\n" +
        "Some large‐scale distributed systems, Architectures of large scale distributed systems.\n",
    "Design principles of Distributed system: Introduction to peer‐to‐peer systems, The peer‐to‐peer\n" +
            "paradigms, Services on structured overlays, Building trust in P2P systems.\n",
    "Communication in Distributed system: System Model – Inter Process Communication – the\n" +
            "API for internet protocols – External data representation and Multicast communication.\n" +
            "Peer to Peer Services: Peer-to-peer Systems - Introduction - Napster and its legacy - Peer-topeer - Middleware - Routing overlays.\n" +
            "File System: Features-File model -File accessing models- File sharing semantics\n" +
            "Naming: Identifiers, Addresses, Name Resolution - Name Space Implementation - Name Caches\n" +
            "- LDAP. \n",
    "Remote Method Invocation and Objects: Remote Invocation - Introduction - Request-reply\n" +
            "protocols - Remote procedure call - Remote method invocation.\n" +
            "Case study: Java RMI – Group communication - Publish-subscribe systems - Message queues -\n" +
            "Shared memory approaches -Distributed objects - Case study: Enterprise Java Beans -from\n" +
            "objects to components. \n",
    "Process Management: Process Migration: Features, Mechanism - Threads: Models, Issues,\n" +
            "Implementation.\n" +
            "Resource Management: Introduction- Features of Scheduling Algorithms -Task Assignment\n" +
            "Approach - Load Balancing Approach - Load Sharing Approach.\n")
val refbookspe23= arrayOf(
    "Coulouris G., Dollimore J., and Kindberg T., “Distributed Systems Concepts and\n" +
            "Design”, 5th Edition, Pearson Education, 2012.(T1)\n" +
            "Distributed Systems: Design and Algorithms,\n" +
            "Editors(s):SergeHaddadFabriceKordonLaurentPautetLaure Petrucci, Wiley online\n" +
            "Library.(T2)\n",
    "A. S. Tanenbaum, M. Van Steen, “Distributed Systems: Principles and Paradigms”,\n" +
            "Pearson Education, 2007.(R1)\n" +
            "P. K. Sinha, “Distributed Systems: Concepts and Design”, Prentice Hall, 2007.(R2)\n")
val modulespe24= arrayOf("Fuzzy Set Theory: Basic Definition and Terminology, Set Theoretic Operations, Fuzzy types\n" +
        "and levels, MF Formulation and Parameterization, MF of two dimensions, Fuzzy Union,\n" +
        "Intersection and Complement, Fuzzy Number,Fuzzy measure.\n",
    "Fuzzy Logic: Fuzzy Rules and Fuzzy Reasoning:Extension Principles and Fuzzy Relations,\n" +
            "Fuzzy IF THEN Rules, Defuzzification,FuzzyReasoning.Fuzzy Inference System: Introduction,\n" +
            "Mamdani Fuzzy Models, Other Variants, Sugeno Fuzzy Models, Tsukamoto Fuzzy Models. \n",
    "Fundamentals of Genetic Algorithms: Basic Concepts, Creation of Offsprings, Encoding,\n" +
            "Fitness Functions, Reproduction, Genetic Modelling: Inheritance Operators, Cross over,\n" +
            "Inversion and detection, Mutation operator, Bitwise operators. \n",
    "Introduction to Artificial Neural Networks: What is a Neural Network? Human Brain, Models\n" +
            "of Neuron, Neural Network viewed as Directed Graphs, Feedback, Network Architecture,\n" +
            "Knowledge Representation, Learning processes:(Error correction, Memory-Based, Hebbian\n" +
            ",Competitive,Boltzman ,Supervised,Unsupervised),Memory,Adaptation. \n",
    "Perceptrons, Adaline, Back Propagation Algorithm, Methods of Speeding, Convolution\n" +
            "Networks, Radical Basis Function Networks, Covers Theorem, Interpolation Learning, The\n" +
            "Hopfield Network. \n")
val refbookspe24= arrayOf(
    "1. Jang J.S.R., Sun C.T. and Mizutani E., “Neuro-Fuzzy and Soft Computing”\n" +
            "PHI/Pearson Education, New Delhi 2004.(T1)\n" +
            "2. Rajasekaran S. & Vijayalakshmi G.A. Pai, PHI, New Delhi 2003.(T2)\n" +
            "3. Ross T. J., “Fuzzy Logic with Engineering Applications.” TMH, New York,\n" +
            "1997.(T3)\n" +
            "4. HaykinsSimon ,”Neural Networks :A Comprehensive Foundation, Pearson\n" +
            "Education,2002.(T4)\n",
    "1. Ray K.S. ,”Soft Computing and Its application”, Vol 1, Apple Academic\n" +
            "Press, 2015. (R1)\n" +
            "2. Lee K.H. ,”First Course on Fuzzy Theory and App.”, Adv in Soft Computing\n" +
            "Spinger, 2005.(R2)\n" +
            "3. Zimmermann H.Z. ,”Fuzzy Set Theory and its App “ , 4th Edition, Spinger\n" +
            "Science, 2001.(R3)\n")

class maths_pe_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_pe_2)
        val button1 = findViewById<Button>(R.id.maths_pe2_sub1)
        val button2 = findViewById<Button>(R.id.maths_pe2_sub2)
        val button3 = findViewById<Button>(R.id.maths_pe2_sub3)
        val button4 = findViewById<Button>(R.id.maths_pe2_sub4)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe21)
            intent.putExtra("books", refbookspe21)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe22)
            intent.putExtra("books", refbookspe22)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe23)
            intent.putExtra("books", refbookspe23)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe24)
            intent.putExtra("books", refbookspe24)
            startActivity(intent)
        }
    }
}