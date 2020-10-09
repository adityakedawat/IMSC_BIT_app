package com.aditya.imscbit.maths

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aditya.imscbit.R
import com.aditya.imscbit.physics.Syllabus
val modulespe31= arrayOf("Introduction to Principles of Counting, The Fundamental of Counting, Multiplication Principle, Addition Rule, Mathematical Induction, Strong Mathematical Induction, Well-ordering Principle, Binomial Theorem, Pascal’s Triangle, Multinomial Coefficient",
    "Permutations, Permutations with Repetitions, Circular Permutations, Ordered Sampling. Combinations, Combinations of Different Objects, Combinations with Repetitions, The Pigeonhole Principle, Generalized Pigeonhole Principle, Derangements, Summation Method. ",
    "Concept of Congruences and its Elementary Properties, Congruences in one unknown, Complete Residue System, Reduced Residue System, Gauss Function, Mobius Function, Chinese Remainder Theorem, Combinatorial Assignments, Partition of Integers, Euler \uF066-Function, Inclusion-Exclusion Principle, Application of Inclusion-Exclusion Principle. ",
    "Recurrence Relations: Order and Degree of Recurrence Relation, Linear Homogenous and Non- Homogeneous Recurrence Relations with Constant coefficients and their Solutions, Solution of Non-linear Homogenous and Non-homogeneous Recurrence Relations. ",
    "Generating Functions, Addition and Multiplication of two Generating Functions, Solution of Recurrence Relations using the method of Generating function, Partition by Generating Function, Generating Function for restricted Partitions.")
val refbookspe31= arrayOf(
    "1. Ralph P. Grimaldi: Discrete and Combinatorial Mathematics – An applied introduction, Pearson Addison Wesley, 5th Edition, 2004. \n" +
            "2. Bikash Kanti Sarkar and Swapan Kumar Chakraborty : Combinatorics and Graph Theory, PHI, 2016. \n" +
            "3. Kolman, Bernard, Robert C. Busby, and Sharon Ross. Discrete mathematical structures. Prentice- Hall, Inc., 2003. \n",
    "1. Rosen, Kenneth H. Handbook of discrete and combinatorial mathematics. Chapman and Hall/CRC, 2017. \n" +
            "2. Swapan Kumar Chakraborty and Bikash Kanti Sarkar: Discrete Mathematics, Oxford Univ. Publication, 2010. \n" +
            "3. Seymour Lipschuz and Mark Lipson: Discrete Mathematics, Shaum’s outlines, 2003. \n" +
            "4. Liu, Chung Laung, Elements of Discrete mathematis, Mcgraw Hill, 2nd edition, 2001. \n")
val modulespe32= arrayOf("Classical Sets, Operations on Classical Sets, Properties of Classical (Crisp) Sets, Mapping of Classical Sets to Functions . Fuzzy Sets, Fuzzy Set Operations, Properties of Fuzzy Sets. Types of Fuzzy Sets. Further Operations on Fuzzy Sets . Algebraic Operation. Set-Theoretic Operations. Criteria for Selecting appropriate Aggregation Operators. Fuzzy Measures . Measures of Fuzziness.",
    "Cartesian Product, Crisp Relations, Cardinality of Crisp Relations, Operations on Crisp Relations , Properties of Crisp Relations ,Composition. Fuzzy Relations, Cardinality of Fuzzy Relations , Operations on Fuzzy Relations, Properties of Fuzzy Relations, Fuzzy Cartesian product and Composition .Fuzzy Graphs. ",
    "The Extension Principle . Operations for Type 2 Fuzzy Sets. Algebraic Operations with Fuzzy Numbers. Special Extended Operations. Extended Operations for LR-Representation of Fuzzy Sets . ",
    "Classical Logic: Tautologies, Contradictions, Equivalence, Exclusive or and Exclusive Nor, Logical Proofs, Deductive Inferences, Fuzzy Logic, Approximate Reasoning, Other Forms of the Implication Operation. Linguistic Variables, Fuzzy Logic, Fuzzy (Rule-Based) Systems. Graphical Techniques of Inference. ",
    "Fuzzy Approach to the Transportation Problem, Fuzzy Set Models in Inventory Control. Fuzzy Sets in Scheduling. Job-Shop Scheduling with Expert Systems. A Method to Control Flexible Manufacturing Systems. Scheduling Courses, Instructors and Classrooms. ")
val refbookspe32= arrayOf(
    "1. H.-J. Zimmermann, Fuzzy Set Theory and Its Applications, Springer Science +Business Media, \n" +
            "\n" +
            "LLC, Fourth Edition, 2001. \n" +
            "2. Timothy J. Ross, Fuzzy Logic with Engineering Applications, Second edition, John Wiley and \n" +
            "\n" +
            "Sons, 2004. \n",
    "1. Klir, G.J. and Yuan, Bo. Fuzzy sets and Fuzzy Logic, Theory and Applications, Prentice Hall of \n" +
            "\n" +
            "India, 2002. \n" +
            "2. Yen, John. and Langari, Reza. Fuzzy Logic – Intelligence, Control and Information, \n" +
            "1999. \n" +
            "3. L. A. Zadeh , “Fuzzy Sets,” Information and Control, vol. 8, pp. 338–353, 1965.\n")
val modulespe33= arrayOf("Overview of Financial Engineering: Financial markets and instruments, interest rates, present and future values of cash flows, risk-free and risky assets. ",
    "Options: call option, put option, expiration date, strike price/exercise price, European, American option and exotic options, put-call parity, a basic properties of options. ",
    "Basic theory of option pricing: single and multi-period binomial pricing models, Cox-Ross-Rubinstein (CRR) model, American option in binomial model, Black-Scholes formula for option pricing as a limit of CRR Model. ",
    "Forwards, futures and swaps : forward and futures contract, pricing of forward and futures, swaps, plain vanilla interest rate swaps, currency swaps, pricing swaps, pricing a commodity swap, pricing an interest rate swap. ",
    "Mean-variance portfolio theory: Markowitz model of portfolio optimization and capital asset pricing model (CAPM). ")
val refbookspe33= arrayOf(
    "1. J Cvitanic and F. Zapatero, Introduction to the Economics and Mathematics of Financial Markets, Prentice. -Hall of India, 2007. \n" +
            "2. M. Capinski and T. Zastawniak, Mathematics for Finance: An Introduction to Financial Engineering, 2nd Ed., Springer, 2010. \n" +
            "3. J. C. Hull, Options, Futures and Other Derivatives, 8th Ed., Pearson India/Prentice Hall, 2011.\n",
    "1. S. Roman, Introduction to the Mathematics of Finance: From Risk Management to Options Pricing, Springer India, 2004. \n" +
            "2. S. R. Pliska, Introduction to Mathematical Finance: Discrete Time Models, Blackwell, 1997. \n" +
            "3. S. N. Neftci, Principles of Financial Engineering, Academic Press/Elsevier India, 2009. \n")
val modulespe34= arrayOf("Meaning and uses of SQC, chance and assignable causes of variation, process and product control, control charts, Chebyshev’s inequality and its applications in SQC, 3\uF073 and 6\uF073 limits. ",
    "Control charts for quantitative characteristics, mean and range chart, standard deviation or \uF073 chart, : Control charts for qualitative characteristics, p chart, d chart, control chart for number of defects per unit (c chart), cumulative sum (CUSUM) chart modified control chart. ",
    "Acceptance Quality Level (AQL), Lot Tolerance Proportion Defective (LTPD), Process Average Fraction Defective (PAFD), Consumer’s risk, Producer’s risk, Rectifying Inspection Plans, Average Outgoing Quality Limit (AOQL), Operating Characteristic (OC) curve, Average Sample Number (ASN), Dodge And Romig rectifying sampling inspection plans, single sampling, double sampling plan, sequential sampling ",
    "Reliability function, Applications of Exponential, Gamma, normal, lognormal, Weibull distributions in reliability and estimation of their parameters, reliability estimation with complete and censored samples. ",
    "Testing of hypothesis and confidence intervals in the context of reliability; reliability of series, parallel and standby systems. ")
val refbookspe34= arrayOf(
    "1. S.C. Gupta and V. K. Kapoor, Fundamentals of Applied Statistics, Sultan Chand & Sons, 2002 \n" +
            "2. S. K. Sinha and B. K. Kale, Life Testing and Reliability Estimation, Wiley Eastern Ltd, 1980\n",
    "1. D. Montgomery, Statistical Quality Control: A Modern Introduction, John Wiley & Sons , 2009 \n" +
            "2. I. Bazovsky, Reliability Theory and Practice, Prentice Hall Inc. Englewood Cliffs, New Jersey,\n")


class maths_pe_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_pe_3)
        val button1 = findViewById<Button>(R.id.maths_pe3_sub1)
        val button2 = findViewById<Button>(R.id.maths_pe3_sub2)
        val button3 = findViewById<Button>(R.id.maths_pe3_sub3)
        val button4 = findViewById<Button>(R.id.maths_pe3_sub4)
        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe31)
            intent.putExtra("books", refbookspe31)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe32)
            intent.putExtra("books", refbookspe32)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe33)
            intent.putExtra("books", refbookspe33)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe34)
            intent.putExtra("books", refbookspe34)
            startActivity(intent)
        }
    }
}