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
val modules21= arrayOf("Three-dimensional space: rectangular coordinates in 3D space, parametric equations of lines, planes, sphere and cylinder.",
    "Double and triple integrals, Iterated integrals and their connections, change of order of integration, Evaluation of area using double integrals, Change of variables in double and triple integrals, Evaluation of volumes using double and triple integrals, Center of Mass and Moment of Inertia.",
    "Vector valued functions, unit tangent, normal and binormal vectors, curvature, torsion and TNB frame.\n" +
            "Motion along the curves: Tangential and normal components of velocity and acceleration.\n" +
            "Calculus of scalar and vector point functions, Gradient, Directional derivative, Divergence and curl, properties, second order derivatives, identities.",
    "Line integrals, vector field, work, circulation, path independence, potential function and conservative field.\n" +
            "Surface integral, flux, volume integral, Gauss, Green’s and Stoke’s theorems, application of vector calculus in engineering problems.",
    "Transformation of coordinates, orthogonal curvilinear coordinates, Gradient, divergence and curl in curvilinear co-ordinate systems, Special orthogonal curvilinear coordinate system: cylindrical, spherical, etc.")
val refbooks21= arrayOf(
    "1. G.B. Thomas and R.L. Finney, Calculus and Analytic geometry, 9th Edition, Pearson, Reprint, 2002.\n" +
            "2. M. D. Weir, J. Hass and F. R. Giordano: Thomas’ Calculus, 11th edition, Pearson Educations, 2008.\n" +
            "3. H Anton, I Brivens, S. Davis: Calculus, 10th Edition, John Wiley and sons, Singapore Pte. Ltd., 2013",
    "1. M. J. Strauss, G. L. Bradley And K. J. Smith, Calculus (3rd Edition), Dorling Kindersley(India) Pvt.\n" +
            "Ltd. (Pearson Education), Delhi, 2007.\n" +
            "2. Murray R Spiegel: Vector Analysis, Metric Editions, Schaum’s Outline series.")
val modules22= arrayOf("First order linear and nonlinear differential equations and their solutions, Trajectories (Orthogonal,\n" +
        "oblique, polar and Cartesian coordinate). Equations of first order but not of first degree and singular\n" +
        "solutions: equation solvable for x and y , Lagrange’s equation, Clairaut’s equation, singular solutions\n" +
        "(Envelopes).",
"Wronskian and linear dependence of functions, Abel’s formula. Higher-order linear differential equations\n" +
        "with constant coefficients, C.F and P.I. Euler-Cauchy equations. Method specific to second ODE:\n" +
        "Methods of undetermined coefficients, reduction of order and Method of variation of parameters.",
"Simultaneous linear differential equations with constant coefficients, total differential equation and\n" +
        "condition of integrability",
"Series solution around an ordinary point and a regular singular point, the method of Frobenius. Bessel and\n" +
        "Legendre equations",
"Initial value problems: Picard’s iteration method, Lipchitz condition, existence and uniqueness of solution\n" +
        "of initial value problems for first order ODEs. Adjoint and Self-Adjoint differential equations, Sturm-\n" +
        "Liouville problem, Eigen values and Eigen functions.")
val refbooks22= arrayOf(
    "1. G.F. Simmons: Differential Equations with Applications and Historical Notes, McGraw-Hill\n" +
            "2. R. C. DiPrima and W. E. Boyce: Ordinary Differential Equations and Boundary Value Problems,\n" +
            "Willey\n" +
            "3. Dennis G. Zill, Warren S. Wright: Advanced Engineering Mathematics, Jones and Bartlett Pubs.\n" +
            "4. Edwards & Penney: Differential Equations and Boundary value problems, Pearson Education\n" +
            "5. S. L. Ross: Differential Equations, Wiley",
    "1. S.J. Farlow: An Introduction to Ordinary Differential Equations, PHI\n" +
            "2. M.D. Raisinghania: Ordinary and Partial Differential Equations, S. Chand & Co.\n" +
            "3. V. Sundarapandian: Ordinary and Partial Differential Equations, McGraw-Hill")
val modules23= arrayOf("Complex Differentiation: Regions in the complex plane, function of a complex variable, Limit,\n" +
        "continuity, differentiability and analyticity of complex variable functions, analytic functions, Cauchy –\n" +
        "Riemann equations in cartesian and polar forms, harmonic functions, harmonic conjugates, Milne\n" +
        "Thomson method",
    "Complex Integration: Integration of complex variable function along contour, line integral, properties of\n" +
            "line integrals, Cauchy’s theorem, Cauchy’s Integral Formula, Cauchy’s Integral formula for derivatives\n" +
            "of analytic function, Cauchy’s Inequality",
    "Infinite Series and Singularities: Power Series, convergence of power series, Taylor’s series, Laurent\n" +
            "Series.\n" +
            "Zeros and singularities of analytic function, types of singularities, properties of singular points",
    "Calculus of Residues: Residues, computation of residues at pole, Cauchy – Residue theorem. Application\n" +
            "of residue calculus in evaluation of improper real integrals of types \uF0F2\n" +
            "\uF070\n" +
            "\uF071 \uF071 \uF071\n" +
            "2\n" +
            "0\n" +
            "f (cos , sin )d and \uF0F2\n" +
            "\uF0A5\n" +
            "\uF02D\uF0A5\n" +
            "f ( x)dx",
    "Conformal Mapping: Mapping (or Transformation) of complex variable function, Conformal Mapping,\n" +
            "Types of elementary transformations – translation, rotation, magnification, inversion, Bilinear\n" +
            "transformation, properties of bilinear transformation.")
val refbooks23= arrayOf(
    "1. J.W. Brown and R.V. Churchill, Complex Variable and its Applications, Tata McGraw Hill, Pub., 7th\n" +
            "Edition, 2014.\n" +
            "2. D.G. Zill and P.D. Shanahan, A First Course in Complex Analysis with Applications, Jones and\n" +
            "Bartlett Publishers, 2003\n" +
            "3. H.S. Kasana, Complex Variables: Theory and Applications, PHI, Second Edition, 2005",
    "1. E. M. Stein and R. Shakarchi, Complex Analysis, Princeton University Press, 2003.\n" +
            "2. S. Ponnusamy and H. Silverman, Complex Variables with Applications, Birkhauser, 2006.\n" +
            "3. M. R. Spiegel, S. Lipschutz, J.J. Schiller and D. Spellman, Complex Variables, Schuam\n" +
            "Outlines, Tata McGraw Publications, 2nd Edition, 2009.")
val modules24= arrayOf("Concepts of Ecology and Environmental science, ecosystem: structure, function and services, Biogeochemical\n" +
        "cycles, energy and nutrient flow, ecosystem management, fate of environmental pollutants, environmental\n" +
        "status and reports on climate change.",
    "Structure and composition of unpolluted atmosphere, classification of air pollution sources, types of air\n" +
            "pollutants, effects of air pollution, monitoring of air pollution, control methods and equipment for air pollution\n" +
            "control, vehicular emissions and control, indoor air pollution, air pollution episodes and case studies.",
    "Water Resource; Water Pollution: types and Sources of Pollutants; effects of water pollution; Water quality\n" +
            "monitoring, various water quality indices, water and waste water treatment: primary, secondary and tertiary\n" +
            "treatment, advanced treatments (nitrate and phosphate removal); Sludge treatment and disposal",
    "Lithosphere – composition, soil properties, soil pollution, ecological & health effects, Municipal solid waste\n" +
            "management – classification of solid wastes, MSW characteristics, collection, storage, transport and disposal\n" +
            "methods, sanitary landfills, technologies for processing of MSW: incineration, composing, pyrolysis.",
    "Noise pollution: introduction, sources: Point, line and area sources; outdoor and indoor noise propagation,\n" +
            "Effects of noise on health, criteria noise standards and limit values, Noise measurement techniques and\n" +
            "analysis, prevention of noise pollution; Radioactive pollution: introduction, sources, classification, health and\n" +
            "safety aspects, Hazards associated with nuclear reactors and disposal of spent fuel rods-safe guards from\n" +
            "exposure to radiations, international regulation, Management of radioactive wastes.")

val refbooks24=arrayOf(
    "1. A, K. De. (3rd Ed). 2008. Environmental Chemistry. New Age Publications India Ltd.\n" +
            "2. R. Rajagopalan. 2016. Environmental Studies: From Crisis to Future by, 3rd edition, Oxford University\n" +
            "Press.\n" +
            "3. Eugene P. Odum. 1971. Fundamentals of Ecology (3rd ed.) -. WB Sunders Company, Philadelphia.\n" +
            "4. C. N. Sawyer, P. L. McCarty and G. F. Parkin. 2002. Chemistry for Environmental Engineering and\n" +
            "Science. John Henry Press.\n" +
            "5. S.C. Santra. 2011. Environmental Science. New Central Book Agency. ",
    "1. D.W. Conell. Basic Concepts of Environmental Chemistry, CRC Press.\n" +
            "2. Peavy, H.S, Rowe, D.R, Tchobanoglous, G. Environmental Engineering, Mc-Graw - Hill International\n" +
            "3. G.M. Masters & Wendell Ela. 1991. Introduction to Environmental Engineering and Science, PHI\n" +
            "Publishers.")
val modules25= arrayOf("",
    "",
    "",
    "",
    "")
val refbooks25= arrayOf(
    "",
    "")
val modules26= arrayOf("Introduction to Programming: Introduction to components of a computer system (disks, memory, processor, where a program is stored and executed, operating system, compilers etc.) Problem Solving: Steps to solve logical and numerical problems. Representation of Algorithm: Flowchart/Pseudo code with adityas. From algorithms to programs; source code, variables (with data types) variables and memory locations, Syntax and Logical Errors in compilation, object and executable code.",
    "Arithmetic expressions and precedence, Conditional Branching and Loops, Writing and evaluation of conditionals, Iterations, Loops.",
    "Array, Character array, strings. Case studies to discuss the various Problems related to Basic science (Matrix addition, Matrix-matrix multiplication, Roots of an equation etc.), Sorting, Searching.",
    "Functions (including using built in libraries), Parameter passing in functions, call by value, call by reference. Passing arrays to functions, Recursion (Finding Factorial, Fibonacci series, Ackerman function etc.).",
    "Structures, Defining structures and Array of Structures Pointers: Defining pointers, Use of Pointers in self-referential structures, File Handling")

val refbooks26= arrayOf(
    "1. Hanly Jery R, Problem solving and Program design in C, 7th Edition Pearson Education.\n" +
            "2. Gottfried Byron, Schaum's Outline of Programming with C, McGraw-Hill.\n" +
            "3. Balaguruswamy E., Programming in ANSI C, Tata McGraw-Hill.\n" +
            "4. Dromey R.G., How to Solve it by Computer, Pearson Education.",
    "1. Kernighan Brian W. and Ritchie Dennis M., The C Programming Language, Prentice.")



//val modules24= arrayOf("",
//    "",
//    "",
//    "",
//    "")
//val refbooks24= arrayOf(
//    "",
//    "")


class maths_sem_2 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.maths_sem2, container, false)
        val button1 = view.findViewById<Button>(R.id.msem2_sub1)
        val button2 = view.findViewById<Button>(R.id.msem2_sub2)
        val button4 = view.findViewById<Button>(R.id.msem2_sub4)
        val button3 = view.findViewById<Button>(R.id.msem2_sub3)
        val button5=view.findViewById<Button>(R.id.msem2_sub5)
        val button6=view.findViewById<Button>(R.id.msem2_elective1)
        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules21)
            intent.putExtra("books", refbooks21)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules22)
            intent.putExtra("books", refbooks22)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules24)
            intent.putExtra("books", refbooks24)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules23)
            intent.putExtra("books", refbooks23)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules25)
            intent.putExtra("books", refbooks25)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules26)
            intent.putExtra("books", refbooks26)
            startActivity(intent)
        }
        return view
    }

    companion object {

        fun newInstance(): maths_sem_2 =
            maths_sem_2()
    }
}
