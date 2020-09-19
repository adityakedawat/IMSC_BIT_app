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

val modules11 = arrayOf("Successive Differentiation and Mean Value Theorem: Leibnitz Theorem, Generalized Mean Value Theorem, Taylor’s and Maclaurin’s Expansion of Functions of Single Variable. Increasing and decreasing functions. Concavity, Convexity and Inflection point of a function. Extrema of functions.","Analysis of functions: Behavior of a function at infinity: Asymptotes. Orthogonal Intersection of Curves, Curvature and Radius of Curvature of a Curve in Cartesian, Parametric, Polar and Tangential Polar forms","Functions of several variables: limit and continuity, partial derivatives. Euler’s theorem, derivatives of composite and implicit functions, total derivatives, Errors and Approximations, Jacobian’s. Taylor’s and Maclaurin’s expansion of functions of several variables, Maxima and minima of functions of several variables, Lagrange’s method of undetermined multipliers","Definite Integral:\n" +
        "Reduction Formula, Differentiation under Integral Sign: Differentiation of Integrals with constant and variable limits, Leibnitz rule. [8L]\n" +
        "Improper integrals: convergence of improper integrals, test of convergence, Beta and Gamma Functions and its Properties, Error functions.","Application of Definite Integral:\n" +
        "Length of a Plane Curve, Area between Two Curves, Volume, Volume of Revolution, Area of Revolution, Work and Moments."
    )
val refbooks11 = arrayOf("1. H Anton, I Brivens, S. Davis : Calculus, 10th Edition, John Wiley and sons, Singapore Pte. Ltd., 2013.\n" +
        "2. M. J. Strauss, G. L. Bradley And K. J. Smith, Calculus, 3rd Ed, Dorling. Kindersley (India)Pvt. Ltd.\n" +
        "(P Ed), Delhi, 2007.\n" +
        "3. M. D. Weir, J. Hass and F. R. Giordano: Thomas’ Calculus, 11th edition, Pearson Educations,2008.","1. Apostol: Calculus Vols 1 and 11.2nd Edition(reprint), John Wiley and sons, 2015.\n" +
        "2. Robert Wrede & Murray R. Spiegel, Advanced Calculus, 3rd Ed., Schaum’s outline series, McGraw-Hill Companies, Inc.,2010"

)
val modules12= arrayOf("Axiomatic description of R, Archimedean property, Bounds: Supremum and infimum of a subset of R, Notion of neighborhood, interior point and limit point of a subset of R, open set and closed set together with their usual properties.",
    "Monotonic sequence, limit of a sequence, convergent, divergent and oscillating sequences, lim sup and lim.inf. of sequences, Bolzano-Weierstrass theorem (Statement only), monotone convergence theorem, subsequence and Cauchy theorems on limit, Cauchy sequence, Nested interval theorem.",
    "Convergence of series of real numbers of positive terms. P series test, comparison tests, Cauchy’s root test, D’ Alembert’s ratio test, Raabe’s test, Cauchy’s Integral Test. Gauss’s Ratio Test, Logarithmic and Higher Logarithmic Ratio Test, Absolute and conditional convergence, Leibnitz’s Rule for Alternating series Test.",
    "Sequence of functions, uniform boundedness, pointwise and uniform convergence of sequence of functions, Series of functions, pointwise and uniform convergence of series of functions, Weierstrass-M Test.",
    "Riemann integral, definition and existence of the integral, Upper and Lower Integrals, Darbous theorem, Properties of the integral, differentiation and integration, Fundamental theorem of integral calculus, Riemann integration of continuous and monotonic functions. Mean value theorems of integral calculus.")
val refbooks12= arrayOf(
    "1. N. P. Bali, Real Analysis, Firewall Media, Laxmi Publications Pvt. Ltd. 2009.\n" +
            "2. S.C. Malik, Principles of Real Analysis (Fourth Edition), New Age International publisher.",
    "1. Donald R. Sherbert and Robert G. Bartle, Introduction to Real Analysis.\n" +
            "2. S. K. Mapa, Introduction to Real Analysis (Revised 6th edition), Sarat book distributers,")
val modules13= arrayOf("Matrices, matrix operations, algebra of matrices, orthogonal, idempotent, nilpotent, involutory, hermitian, skew- hermitian, unitary matrices and their properties, partition of matrices.",
    "Elementary operations, elementary matrices, inverse using elementary transformations, rank of a matrix, row-reduced echelon form, normal form, consistency of system of linear equations using rank (homogeneous and non - homogeneous).",
    "Solution to system of linear equations using gaussian elimination, Gauss – Jordan method, LU decomposition. Linear independence and dependence of vectors, introduction to linear transformations, matrix of linear transformation.",
    "Matric polynomials, characteristic equation, eigenvalues, eigenvectors, algebraic and geometric multiplicity of eigen values, diagonalization of matrices, orthogonal diagonalization, minimal polynomials.",
    "Cayley-Hamilton theorem and its applications, real quadratic forms: definitions, examples of positive definite, positive semi definite, negative definite, negative semi definite and indefinite quadratic forms, rank, index and signature of quadratic forms.")
val refbooks13= arrayOf(
    "1. S. Lipschutz, M. L. Lipson: Schaum's Outline of Linear Algebra, Mcgraw-Hill.\n" +
            "2. David c. Lay, Linear Algebra and its Applications (3rd Edition), Pearson Ed. Asia, Indian Reprint, 2007.",
    "1. Higher Algebra Abstract and Linear, S K Mapa, Levant Publications")
val modules14= arrayOf("Introduction to Business Communication:\n" +
        "Importance and Objectives of Business communication, Process of communication, Barriers to\n" +
        "effective communication, Techniques of effective communication. Forms of communication (Written,\n" +
        "Oral, audio-visual communication).",
    "Managing Business Communication:\n" +
            "Formal and Informal communication, Non- verbal communication (Body language, Gestures,\n" +
            "Postures, Facial expressions). The cross cultural dimensions of business communication. Techniques\n" +
            "to effective listening, methods and styles of reading. ",
    "Other aspects of communication:\n" +
            "Vocabulary:\n" +
            "Single word substitution, Idioms and phrases, Precis writing, Comprehension.\n" +
            "Group Discussions, Extempore, Principles of effective speech and presentations, Role playing.\n",
    "Introduction to managerial writing:\n" +
            "Business letters: Inquiries, Circulars, Quotations, Orders, Acknowledgement, Claims & adjustments,\n" +
            "Collection letters, Sales letters, Drafting of different resumes, Covering letters Applying for a job,\n" +
            "Social correspondence, Invitation to speak.\n" +
            "Official Correspondence: Memorandum, Notice, Agenda, Minutes, Circular letters. ",
    "Report writing:\n" +
            "Business reports, Types, Characteristics, Importance, Elements of structure, Process of writing, Order\n" +
            "of writing, the final draft, check lists for reports.")

val refbooks14= arrayOf(
    "T1. Communication Skills, Sanjay Kumar &PushpLata, Oxford University Press\n" +
            "T2. Business Correspondence and Report Writing,R.C.Sharma, Krishna Mohan.Mcgraw Hill\n" +
            "T3. Communication for Business,Shirley Taylor, V.Chandra, Pearson\n" +
            "T4. Business Communication- HorySankar Mukherjee, Oxford University Press\n" +
            "T5. Basic Business Communication- .Lesikar I Flatley, McGraw Hill.\n" +
            "T6. Business Communication Today ,Bovee, Thill and Chaterjee, Pearson",
    "")
val modules15= arrayOf("Bohr’s theory, Wave mechanics: de Broglie equation, Heisenberg’s Uncertainty Principle, Schrödinger’s\n" +
        "wave equation, significance of ψ and ψ2\n" +
        ". Quantum numbers and their significance. Normalized and\n" +
        "orthogonal wave functions. Sign of wave functions. Radial and angular wave functions for hydrogen\n" +
        "atom. Radial and angular distribution curves. Shapes of s, p, d and f orbitals. Contour boundary and\n" +
        "probability diagrams. Pauli’s Exclusion Principle, Hund’s rule, Aufbau’s principle, Variation of orbital\n" +
        "energy with atomic number. ",
    "s, p, d, f block elements, the long form of periodic table. Detailed discussion of properties of the elements\n" +
            "with reference to s and p-block. Shielding effect, Slater rules, variation of properties in periodic table.\n" +
            "Atomic & Ionic radii (van der Waals), Ionization enthalpy, electron gain enthalpy, Electronegativity,\n" +
            "hybridization, group electronegativity. Sanderson’s electron density ratio. ",
    "Organic Compounds: Classification, Nomenclature, Hybridization, Electronic Displacements: Inductive,\n" +
            "electromeric, resonance and mesomeric effects, hyperconjugation, Dipole moment. Organic acids and\n" +
            "bases. Homolytic and Heterolytic fission, arrow rules, Electrophiles and Nucleophiles; Carbocations,\n" +
            "Carbanions, Free radicals and Carbenes. Introduction to types of organic reactions and their mechanism:\n" +
            "Addition, Elimination and Substitution reactions. ",
    "Ionic bond: Radius ratio rule, Packing of ions in crystals. Born-Landé equation, Madelung constant,\n" +
            "Born-Haber cycle. Metallic Bond: valence bond and band theories, defects in solids. Weak Chemical\n" +
            "Forces: Van der Waals forces, ion-dipole forces, dipole-dipole interactions, induced dipole interactions,\n" +
            "Hydrogen bonding. Covalent bond: Lewis structure, Valence Bond theory, Resonance and resonance\n" +
            "energy, Molecular orbital theory. Molecular orbital diagrams of diatomic and simple polyatomic \n" +

            "molecules, Valence shell electron pair repulsion theory (VSEPR), multiple bonding. Fajan’s rules and\n" +
            "consequences of polarization. \n",
    "Fischer Projection, Newmann and Sawhorse Projection formulae and their interconversions; Geometrical\n" +
            "isomerism: cis–trans and, syn-anti isomerism E/Z notations with C.I.P rules.\n" +
            "Optical Isomerism: Optical Activity, Specific Rotation, Chirality/Asymmetry, Enantiomers, Molecules\n" +
            "with two or more chiral-centres, Distereoisomers, meso structures, Racemic mixture and resolution.\n" +
            "Relative and absolute configuration: D/L and R/S designations. ")

val refbooks15=arrayOf(
    "1. Lee, J. D. Concise Inorganic Chemistry ELBS, 1991.\n" +
            "2. Douglas, B. E. and McDaniel, D. H. Concepts & Models of Inorganic Chemistry Oxford, 1970\n" +
            "3. Finar, I. L. Organic Chemistry (Volume 1), Dorling Kindersley (India) Pvt. Ltd. (Pearson\n" +
            "Education).\n" +
            "4. Finar, I. L. Organic Chemistry (Volume 2: Stereochemistry and the Chemistry of Natural\n" +
            "Products), Dorling Kindersley (India) Pvt. Ltd. (Pearson Education).\n" +
            "5. Morrison, R. N. & Boyd, R. N. Organic Chemistry, Dorling Kindersley (India) Pvt. Ltd. (Pearson\n" +
            "Education). \n",
    "1. Atkins, P. W. & Paula, J. Physical Chemistry, 10th Ed., Oxford University Press, 2014.\n" +
            "2. Day, M. C. and Selbin, J. Theoretical Inorganic Chemistry, ACS Publications, 1962.\n" +
            "3. Rodger, G. E. Inorganic and Solid State Chemistry, Cengage Learning India Edition, 2002.\n" +
            "4. Kalsi, P. S. Stereochemistry Conformation and Mechanism, New Age International, 2005.\n")


//val modules14= arrayOf("",
//    "",
//    "",
//    "",
//    "")
//val refbooks14= arrayOf(
//    "",
//    "")


class maths_sem_1 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.maths_sem_1, container, false)
        val button1 = view.findViewById<Button>(R.id.msem1_sub1)
        val button2 = view.findViewById<Button>(R.id.msem1_sub2)
        val button4 = view.findViewById<Button>(R.id.msem1_sub4)
        val button3 = view.findViewById<Button>(R.id.msem1_sub3)
        val button5=view.findViewById<Button>(R.id.msem1_sub5)
        button1.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules11)
            intent.putExtra("books", refbooks11)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules12)
            intent.putExtra("books", refbooks12)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules14)
            intent.putExtra("books", refbooks14)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules13)
            intent.putExtra("books", refbooks13)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules15)
            intent.putExtra("books", refbooks15)
            startActivity(intent)
        }
        return view
    }

    companion object {

        fun newInstance(): maths_sem_1 =
            maths_sem_1()
    }
}
