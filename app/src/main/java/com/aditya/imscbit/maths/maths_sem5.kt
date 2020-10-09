package com.aditya.imscbit.maths

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Physics_PE_I
import com.aditya.imscbit.physics.Syllabus
val modules51= arrayOf("Axioms of probability, Probability space, Conditional probability, Independent events, Bayes' theorem,\n" +
        "discrete and continuous random variables, Cumulative distribution function, probability mass and density\n" +
        "functions, mathematical expectation, variance, moment generating function. ",
    "Discrete and continuous probability distributions such as Bernoulli, Binomial, Negative Binomial,\n" +
            "Poisson, Uniform, Exponential, Beta, Gamma and Normal distribution, distribution of function of random\n" +
            "variable. Covariance, Correlation and regression Analysis.",
    "Joint distribution for two dimensional random variables, marginal distributions, conditional distributions,\n" +
            "conditional expectation, conditional variance, independence of random variables, distribution of sum of\n" +
            "two independent random variables. The Central Limit Theorem, t-distribution, Chi-Square Distribution,\n" +
            "F- Distribution.",
    "Point Estimation and Interval Estimation, Interval Estimation of three Common Parameters: mean,\n" +
            "variance and proportion. The method of moments and the method of maximum likelihood estimation,\n" +
            "confidence intervals for the mean(s) and variance(s) of normal populations. ",
    "Testing of Statistical hypothesis: Null and alternative hypotheses, the critical and acceptance regions, two\n" +
            "types of error, tests involving a population mean, tests involving a population proportion, tests involving\n" +
            "a population variance, tests for two population means, tests for two population proportions, tests for two\n" +
            "population variance. ")
val refbooks51= arrayOf(
    "1. Johnson R.A, Miller I. and Freund J.: Probability and Statistics for Engineers, PHI\n" +
            "2. Hogg, R.V. and Tanis E.A.: Probability and Statistical Inference, Pearson\n" +
            "3. Pal N. and Sarkar S.: Statistics: Concepts and Applications, PHI\n" +
            "4. Gupta S.C and Kapoor V.K.: Fundamental of Mathematical Statistics, Sultan Chand and Sons\n" +
            "5. Walpole, R.E., Myers, R.E., Myers R.H., Myers S.L. and Ye K.: Probability for Statistics and\n" +
            "Engineers, Pearson",
    "1. Feller W.: Introduction to Probability theory and applications, John Wiley\n" +

            "2. Freund J.E.: Mathematical Statistics, Pearson\n" +
            "3. Meyer P.L.: Introductory Probability and Statistical Applications, Oxford & IBH,\n" +
            "4. Hines W., Montgomery D., Goldsman, D. and Borror, C.: Probability & Statistics in Engineering,\n" +
            "John Wiley")
val modules52= arrayOf("Classical sets: operations on classical (crisp) sets, Properties of classical sets, Mapping of classical sets to functions. Fuzzy Sets: Basic Fuzzy set operations, Properties of Fuzzy sets. Representation of Fuzzy Sets, Types of Membership Function, Development of Membership Functions. Properties of membership functions, Fuzzification and Defuzzification.",
    "Crisp Relations: cartesian product, other crisp relations, operations on Relations. The Extension Principle for fuzzy sets. Fuzzy Relations: Fuzzy Cartesian product, operations of Fuzzy relations. Compositions of Fuzzy Relations, Properties of the Min-Max Composition.",
    "Fuzzy Arithmetic: Fuzzy Numbers, Linguistic Variables, Arithmetic operations on interval, arithmetic operations on fuzzy numbers, Algebraic Operations with Fuzzy Numbers, Lattice of Fuzzy Numbers.",
    "Crisp logic: Law of Propositional logic, Inference in Propositional Logic. First Order Predicate Logic, Predicate Logic: Interpretation of Predicate Logic Formula, Inference in Predicate Logic. Fuzzy Logic: Fuzzy Quantifiers, Fuzzy Inference. Fuzzy Rule based system. Defuzzification Methods.",
    "Decision Making in Fuzzy Environment: Fuzzy Decisions, Fuzzy Linear Programming, Symmetric Fuzzy LP, Fuzzy LP with crisp objective Function. Applications: Fuzzy Approach to Transportation Problem, Fuzzy sets model in inventory control.")
val refbooks52= arrayOf(
    "1. Timothy J. Ross, Fuzzy Logic with Engineering Applications, Wiley, India.\n" +
            "2. George J. Klir /Bo Yuan, Fuzzy Sets and Fuzzy Logic, Theory and Applications, PHI learning\n" +
            "private Limited.",
    "1. H.-J. Zimmermann, Fuzzy Set Theory and its Application, Kluwer Academic Publishers.\n" +
            "2. John Yen and Reza Langari, Fuzzy Logic: Intelligence, Control and information, Pearson Education.")
val modules53= arrayOf("Algorithms and Complexity\n" +
        "Introduction, Algorithm Complexity and various cases using Insertion Sort, Asymptotic\n" +
        "Notations, Time complexity of Recursive Algorithm, Solving Recurrences using Iterative,\n" +
        "Recursion Tree and Master Theorem. \n",
    "Divide and Conquer\n" +
            "Discussion of basic approach using Binary Search, Merge Sort , Quick Sort , Selection in\n" +
            "Expected linear time, Maximum Subarray , Matrix Multiplication , Introduction of Transform\n" +
            "and Conquer and AVL Tree . \n",
    "Dynamic Programming\n" +
            "Introduction and Approach, Rod Cutting, LCS, Optimal BST, Transitive closure and All-pair\n" +
            "Shortest Path, Travelling Salesperson Problem. \n",
    "Greedy and other Design Approaches\n" +
            "Introduction to greedy using fractional knapsack, Huffman Code, Minimum Spanning Tree –\n" +
            "Prim and Kruskal, Single Source Shortest Path Dijkstra’s and Bellman-Ford, Introduction to\n" +
            "Backtracking using N-Queens problem, Introduction to Branch and Bound using Assignment\n" +
            "Problem or TSP.\n",
    "NP Completeness and Other Advanced Topics\n" +
            "Non-deterministic algorithms – searching and sorting, Class P and NP, Decision and\n" +
            "Optimization problem, Reduction and NPC and NPH, NP Completeness proof for: SAT, MaxClique, Vertex Cover, Introduction to Randomized Algorithms, Introduction to Approximation\n" +
            "Algorithms. \n")
val refbooks53= arrayOf(
    "1. Cormen Thomas H. et al., Introduction to Algorithms. 3rd Edition, PHI Learning, latest\n" +
            "edition.\n",
    "2. Horowitz E., Sahani, Fundamentals of Computer Algorithms, Galgotia Publication Pvt.\n" +
            "Ltd. \n" +
            "3. Dave and Dave, Design and Analysis of Algorithms, 2nd Edition, Pearson. \n" +
            "4. Goodrich, Tamassia. Algorithm Design. Wiley. \n")
val modules54= arrayOf("Introduction to Automata: (mathematical model of digital devices, including real computer),\n" +
        "State Transition Graph, Finite Automaton (FA) and its types, Deterministic Finite\n" +
        "Automaton (DFA), Non-deterministic Finite Automaton (NDFA), Complement, Union,\n" +
        "Intersection of FA’s , Conversion Strategy from NDFA to DFA , Minimization of FA,\n" +
        "Finite Automaton with Output, Applications of FA. \n",
    "Regular Expressions(RE): Introduction , R.E.’s and basic operations, Algebraic laws on\n" +
            "Regular Expression, Finite and Infinite Languages, Equivalence of finite Automaton and\n" +
            "regular expressions, Constructing NDFA from Regular Expression , Pumping Lemma for\n" +
            "Regular Language, Closure properties of Regular Languages, Non-regular languages,\n" +
            "Applications of Regular Expression. \n",
    "Grammar:Introduction, Formal Definition of Grammar, The Chomsky Hierarchy of\n" +
            "Grammar, Designing Regular grammar from DFA, Context Free Grammar, Closure\n" +
            "properties of Context Free Languages, , CFG and Normal form: Chomsky Normal Form,\n" +
            "Greibach Normal Form, Non-Context Free Language, Applications of CFGs. \n",
    "Push Down Automation (PDA): Introduction, Definition of PDA, Types of Pushdown\n" +
            "Automata (DPDA and NPDA), Converting CFG to PDA, Derivation (Parsing), Parsing\n" +
            "Techniques, Ambiguous and Unambiguous Grammar, Demerits of Ambiguous Grammar. \n",
    "Turing Machine(TM): Single Tape TM, Variations of TM, Halting Problem, Turing\n" +
            "Machine and Languages, Enumerable Languages, Decidable, Recognizable and Undecidable\n" +
            "languages, Solvable and Unsolvable problems, Post Correspondence Problems(PCP), Classes\n" +
            "of Problems: P, NP, NP-C and NP-Hard. \n")
val refbooks54= arrayOf(
    "Hopcroft J.E., Motwani R. and Ullman J.D, Introduction to Automata Theory, Languages and\n" +
            "Computations, Second Edition, Pearson Education, 2008. \n",
    "Mishra K.L.P. andChandrasekaran N. , Theory of Computer Science: Automata,\n" +
            "Languages and Computation, 3rd Edition, PHI.(R1)\n" +
            "Martin John C., Introduction to Languages and the Theory of Computation, 3rd Edition,\n" +
            "TataMcGraw Hill Publishing Company, New Delhi, 2007. (R2)\n" +
            "Lewis Harry R. and Papadimitriou Christos H., Elements of the theory of Computation,\n" +
            "2nd Edition, Prentice-Hall of India Pvt. Ltd. (R3)\n")
val modules55= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks55= arrayOf(
    "",
    "")



class maths_sem_5 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.maths_sem_5, container, false)
        val button1 = view.findViewById<Button>(R.id.msem5_sub1)
        val button2 = view.findViewById<Button>(R.id.msem5_sub2)
        val button4 = view.findViewById<Button>(R.id.msem5_sub4)
        val button3 = view.findViewById<Button>(R.id.msem5_sub3)
        val button5=view.findViewById<Button>(R.id.msem5_sub5)
        val button6=view.findViewById<Button>(R.id.msem5_sub6)

        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules51)
            intent.putExtra("books", refbooks51)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules52)
            intent.putExtra("books", refbooks52)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules54)
            intent.putExtra("books", refbooks54)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules53)
            intent.putExtra("books", refbooks53)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, maths_pe_1::class.java)

            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(activity, maths_pe_2::class.java)

            startActivity(intent)
        }

        return view
    }

    companion object {

        fun newInstance(): maths_sem_5 =
            maths_sem_5()
    }
}