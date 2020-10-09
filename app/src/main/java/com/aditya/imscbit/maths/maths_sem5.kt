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
val modules53= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks53= arrayOf(
    "",
    "")
val modules54= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks54= arrayOf(
    "",
    "")
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
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules55)
            intent.putExtra("books", refbooks55)
            startActivity(intent)
        }
//        button6.setOnClickListener {
//            val intent = Intent(activity, Syllabus::class.java)
//            intent.putExtra("modules", modules56)
//            intent.putExtra("books", refbooks56)
//            startActivity(intent)
//        }

        return view
    }

    companion object {

        fun newInstance(): maths_sem_5 =
            maths_sem_5()
    }
}