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
val modules61= arrayOf("Linear Programming Problem (LPP): Mathematical Formulation of LPP, Solution of LPP: Graphical Method with special cases, Simplex Method, Big-M Method, Two Phase method. Special cases in simplex method, Duality theory, Dual Simplex algorithm, Post-optimal Analysis: cases of changes in objective function and right hand side parameter of the constraints.",
    "Transportation and Assignment Models: Solution of Transportation problem: Initial Basic Feasible Solution by North-West Corner Method, least Cost, Vogel Approximation Method. Optimal solution by MODI Method. Assignment Model: Hungarian Method.",
    "Advanced Linear Programming: Revised Simplex Method, Parametric Linear Programming, Integer Linear Programming: Branch and Bound Method, Cutting Plane Method, Solution of Travelling salesman Problem by integer programming.",
    "Network Analysis (CPM and PERT): Network and basic components, Determination of critical path: Critical Path Method (CPM),Project Evaluation and Review Techniques(PERT).Time-cost optimization Algorithm.",
    "Sequencing Problem: Problem of Sequencing, Processing n Jobs through Two Machines, Processing n Jobs through 3 Machines and Processing n Jobs through k Machines.")
val refbooks61= arrayOf(
    "1. Hamdy A Taha : Operations Research, Pearson Education.\n" +
            "2. Kanti Swarup, P. K. Gupta and Manmohan: Operations Research, Sultan chand & Sons.",
    "1. Hiller and Lieberman: Operation Research, McGraw Hill.\n" +
            "2. J. K. Sharma: Operations Research: Theory and applications, Mac-Millan Publishers.\n" +
            "3. S. S. Rao: Engineering Optimization: Theory and Practice, Fourth Edition, John Wiley and Sons.\n" +
            "4. R. K. Gupta: Operations Research, Krishna Prakashan Media Pvt.Ltd.")
val modules62= arrayOf("Definition and sources of errors, propagation of errors, backward error analysis, sensitivity and conditioning, stability and accuracy, floating-point arithmetic and rounding errors. Solution of algebraic and transcendental equations: Bisection method, Secant method, Regula-Falsi method, Newton-Raphson method and its variants, General iterative method and their convergence analysis.",
    "Gauss-Elimination, Gauss-Jordan, LU-Decomposition, Cholesky, Gauss-Jacobi and Gauss-Seidel methods to solve linear system of equation. Error and convergence analysis of above methods. Power method to find least and largest eigenvalues.",
    "Lagrange’s interpolation, Newton’s divided differences interpolation formulas, inverse interpolation, interpolating polynomial using finite differences, Hermite interpolation, Piecewise interpolation, spline interpolation, B-splines, cubic splines and function approximations by least squares and uniform approximations.",
    "Differentiation using interpolation formulas, Integration using Newton-Cotes formulas (Trapezoidal rule, Simpson’s 1/3, 3/8 rule, Weddle’s rule) and their error analysis.",
    "Euler’s method, modified Euler’s method, Runge Kutta Methods of second and fourth order, Predictor-Corrector methods (Milne & Adams-Bashforth) to solve initial value problems, Shooting and finite difference methods for boundary value problems.")
val refbooks62= arrayOf(
    "1. Jain M.K.: Numerical Methods for Scientific and Engineering Computation, New Age Publication.\n" +
            "2. Sastry S.S.: Introductory Methods of Numerical Analysis, PHI\n",
    "1. Chapra S.C. and Canale R.P.: Numerical Methods for Engineers, McGraw Hill\n" +
            "2. Hamming R.W.: Numerical Methods for Scientists and Engineers, Dover Publications")
val modules63= arrayOf("Database Design and Entity - Relational Model\n" +
        "Purpose of Database System; View of Data, Database Languages, Transaction Management,\n" +
        "Database architecture, Database Users and Administrator, Types of database System, Overview\n" +
        "of design process, E-R model, Constraints, E–R Diagram, E-R Diagram issues, Weak Entity\n" +
        "Sets, Extended E – R Features, Reduction to E–R Schemas. \n",
    "Relational Model\n" +
            "Structure of Relational Database, Codd's Rules, Fundamental Relational Algebra Operations,\n" +
            "Additional Relational Algebra Operations, Extended Relational Algebra Operations, Data\n" +
            "definition, Basic structure of SQL queries, Set Operations, Aggregate Functions, Null Values,\n" +
            "Nested Sub Queries, complex queries, views, modification of database, Joined relations, SQL\n" +
            "data types & schemas, Integrity constraints, authorization, Embedded SQL, Triggers.\n",
    "Relational Database Design\n" +
            "Functional dependency, Decomposition, Normalization, First normal form, Second normal form,\n" +
            "Third normal form, BCNF, Multivalued dependencies and Fourth normal form, Join\n" +
            "dependencies and Fifth normal form, DKNF. \n",
    "Indexing & Hashing\n" +
            "Ordered Indices, B+ Tree index files, B-Tree index files, Multiple key access Static hashing,\n" +
            "Dynamic Hashing, Comparison of ordered indexing and hashing, Index definition in SQL.\n" +
            "Query Processing\n" +
            "Measure of Query Cost, Selection Operation, Evaluation of Expressions. \n",
    "Transaction & Concurrency Control\n" +
            "Transaction Concepts & ACID Properties, Transaction States, Implementation of Atomicity &\n" +
            "Durability, Concurrent Executions, Serializability& Its Testing, Recoverability, Lock-Based\n" +
            "protocols, Validation based protocol, Multiple Granularity, Multiversion Schemes, Deadlock\n" +
            "Handling. \n")
val refbooks63= arrayOf(
    "Silberschatz A. et.al, Database System Concepts, 6th Edition, Tata Mc-Graw Hill, New\n" +
            "Delhi, 2011. \n",
    "Elmasri R., Fundamentals of Database Systems, 7thEdition, Pearson Education, New\n" +
            "Delhi, 2016. (R1)\n" +
            "Ullman Jeffrey D et.al., A First course in Database Systems, 3rd Edition, Pearson\n" +
            "Education, New Delhi- 2014.(R2)\n")
val modules64= arrayOf("Operating system Overview\n" +
        "Operating system Objective and Functions, Evolution of Operating System, Major Advances in\n" +
        "OS Components, Characteristics of Modern Operating Systems\n" +
        "Process Description and Control\n" +
        "Process Concept, Process States, Process Description, Process Control, Threads, Types of\n" +
        "Threads, Multicore and Multithreading\n",
    "Scheduling\n" +
            "Type of scheduling, Uniprocessor Scheduling, Multiprocessor Scheduling\n",
    "Concurrency\n" +
            " Mutual Exclusion and Synchronization\n" +
            "Principle of Concurrency, Mutual Exclusion, Hardware Support, Semaphores, Monitors,\n" +
            "Message Passing, Readers/Writers Problem\n" +
            "Deadlock and Starvation\n" +
            "Principle of Deadlock, Deadlock Prevention, Deadlock Avoidance, Deadlock Detection, Dining\n" +
            "Philosopher Problem\n",
    "Memory Management\n" +
            "Memory Management Requirements, Memory Partitioning, Paging, Segmentation\n" +
            "Virtual Memory\n" +
            "Hardware and Control Structures, Operating System Policies for Virtual Memory\n",
    "I/O Management and Disk Scheduling\n" +
            "I/O device, Organization of the I/O Function, Operating System Design Issues, I/O Buffering,\n" +
            "Disk Scheduling, RAID, Disk Cache\n" +
            "File Management\n" +
            "Overview, File Organization and Access, File Directories, File Sharing, Record Blocking, File\n" +
            "Allocation and Free Space Management\n")
val refbooks64= arrayOf(
    "1. StallingsW., Operating systems - Internals and Design Principles, , 8th Edition, Pearson,\n" +
            "2014.\n",
    "1. SilberchatzAbraham, Galvin Peter B.,Gagne Greg, Operating System Principles, 9th\n" +
            "Edition, Wiley Student Edition, 2013.\n" +
            "2. Tanenbaum Andrew S., Modern Operating Systems, 4th Edition, Pearson, 2014.\n" +
            "3. Dhamdhere D. M. ,Operating Systems A concept - based Approach, 3rd Edition,\n" +
            "McGrawHill Education, 2017.\n" +
            "4. Stuart B. L., Principles of Operating Systems, 1st Edition, 2008, Cengage learning, India\n" +
            "Edition.\n" +
            "5. Godbole A. S., Operating Systems, 3rd Edition, McGrawHill Education, 2017.\n")


class maths_sem_6 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.maths_sem_6, container, false)
        val button1 = view.findViewById<Button>(R.id.msem6_sub1)
        val button2 = view.findViewById<Button>(R.id.msem6_sub2)
        val button4 = view.findViewById<Button>(R.id.msem6_sub4)
        val button3 = view.findViewById<Button>(R.id.msem6_sub3)
        val button5=view.findViewById<Button>(R.id.msem6_sub5)
        val button6=view.findViewById<Button>(R.id.msem6_sub6)

        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules61)
            intent.putExtra("books", refbooks61)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules62)
            intent.putExtra("books", refbooks62)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules64)
            intent.putExtra("books", refbooks64)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules63)
            intent.putExtra("books", refbooks63)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, maths_pe_3::class.java)

            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(activity, maths_pe_4::class.java)

            startActivity(intent)
        }

        return view
    }

    companion object {

        fun newInstance(): maths_sem_6 =
            maths_sem_6()
    }
}
