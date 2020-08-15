package com.example.imscbit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [physics_sem_1.newInstance] factory method to
 * create an instance of this fragment.
 */
val modules21= arrayOf("Fourier Series: Periodic functions. Orthogonality of sine and cosine functions, Dirichlet\n" +
        "Conditions (Statement only). Expansion of periodic functions in a series of sine and cosine\n" +
        "functions and determination of Fourier coefficients. Complex representation of Fourier\n" +
        "series. Expansion of functions with arbitrary period. Expansion of non-periodic functions\n" +
        "over an interval. Even and odd functions and their Fourier expansions. Application.\n" +
        "Summing of Infinite Series. Term-by-Term differentiation and integration of Fourier Series.\n" +
        "Parseval Identity.",
    "Frobenius Method and Special Functions: Singular Points of Second Order Linear\n" +
            "Differential Equations and their importance. Frobenius method and its applications to\n" +
            "differential equations. Legendre, Bessel, Hermite and Laguerre Differential Equations.\n" +
            "Properties of Legendre Polynomials: Rodrigues Formula, Generating Function,\n" +
            "Orthogonality. Simple recurrence relations. Expansion of function in a series of Legendre\n" +
            "Polynomials. Bessel Functions of the First Kind: Generating Function, simple recurrence\n" +
            "relations. Zeros of Bessel Functions (Jo(x) and J1(x)) and Orthogonality.",
    "Some Special Integrals: Beta and Gamma Functions and Relation between them.\n" +
            "Expression of Integrals in terms of Gamma Functions. Error Function (Probability Integral).\n" +
            "Theory of Errors: Systematic and Random Errors. Propagation of Errors. Normal Law of\n" +
            "Errors. Standard and Probable Error. Least-squares fit. Error on the slope and intercept of a\n" +
            "fitted line.",
    "Partial Differential Equations: Solutions to partial differential equations, using separation of variables: Laplace's Equation in problems of rectangular, cylindrical and\n" +
            "spherical symmetry. Wave equation and its solution for vibrational modes of a stretched\n" +
            "string, rectangular and circular membranes. Diffusion Equation.",
    "Orthogonal Curvilinear Coordinates:\n" +
            "Orthogonal Curvilinear Coordinates. Derivation of Gradient, Divergence, Curl and\n" +
            "Laplacian in Cartesian, Spherical and Cylindrical Coordinate Systems.")
val refbooks21= arrayOf(
    "1. T1: Mathematical Methods for Physicists: Arfken, Weber, 2005, Harris, Elsevier.\n" +
            "2. T2: Fourier Analysis by M.R. Spiegel, 2004, Tata McGraw-Hill.\n" +
            "3. T3: Mathematics for Physicists, Susan M. Lea, 2004, Thomson Brooks/Cole.",
    "1. R1: Differential Equations, George F. Simmons, 2006, Tata McGraw-Hill.\n" +
            "2. R2: Partial Differential Equations for Scientists & Engineers, S.J. Farlow, 1993, Dover Pub.\n" +
            "3. R3: Engineering Mathematics, S.Pal and S.C. Bhunia, 2015, Oxford University Press\n" +
            "4. R4: Mathematical methods for Scientists & Engineers, D.A. McQuarrie, 2003, Viva Books")
val modules22= arrayOf("Superposition of Collinear Harmonic oscillations: Linearity and Superposition Principle.\n" +
        "Superposition of two collinear oscillations having (1) equal frequencies and (2) different\n" +
        "frequencies (Beats). Superposition of N collinear Harmonic Oscillations with (1) equal phase\n" +
        "differences and (2) equal frequency differences.\n" +
        "Superposition of two perpendicular Harmonic Oscillations: Graphical and Analytical Methods.\n" +
        "Lissajous Figures with equal an unequal frequency and their uses.\n" +
        "Wave Motion: Plane and Spherical Waves. Longitudinal and Transverse Waves. Plane\n" +
        "Progressive (Travelling) Waves. Wave Equation. Particle and Wave Velocities. Differential\n" +
        "Equation. Pressure of a Longitudinal Wave. Energy Transport. Intensity of Wave. Water Waves:\n" +
        "Ripple and Gravity Waves.",
    "Velocity of Waves: Velocity of Transverse Vibrations of Stretched Strings. Velocity of\n" +
            "Longitudinal Waves in a Fluid in a Pipe. Newton’s Formula for Velocity of Sound. Laplace’s\n" +
            "Correction.\n" +
            "Superposition of Two Harmonic Waves: Standing (Stationary) Waves in a String: Fixed and Free\n" +
            "Ends. Analytical Treatment. Phase and Group Velocities. Changes with respect to Position and\n" +
            "Time. Energy of Vibrating String. Transfer of Energy. Normal Modes of Stretched Strings. Plucked\n" +
            "and Struck Strings. Melde’s Experiment. Longitudinal Standing Waves and Normal Modes. Open\n" +
            "and Closed Pipes.Superposition of N Harmonic Waves.\n" +
            "Wave Optics: Electromagnetic nature of light. Definition and properties of wave front. Huygens\n" +
            "Principle. Temporal and Spatial Coherence.",
    "Interference: Division of amplitude and wavefront. Young’s double slit experiment. Lloyd’s\n" +
            "Mirror and Fresnel’s Biprism. Phase change on reflection: Stokes’ treatment. Interference in Thin\n" +
            "Films: parallel and wedge-shaped films. Fringes of equal inclination (Haidinger Fringes); Fringes of\n" +
            "equal thickness (Fizeau Fringes). Newton’s Rings: Measurement of wavelength and refractive index\n" +
            "Interferometer: Michelson Interferometer-(1) Idea of form of fringes (No theory required), (2)\n" +
            "Determination of Wavelength, (3) Wavelength Difference, (4) Refractive Index, and (5) Visibility\n" +
            "of Fringes. Fabry-Perot interferometer.",
    "Diffraction: Kirchhoff’s Integral Theorem, Fresnel-Kirchhoff’s Integral formula. (Qualitative\n" +
            "discussion only) Fraunhofer diffraction: Single slit. Circular aperture, Resolving Power of a telescope. Double slit.\n" +
            "Multiple slits. Diffraction grating. Resolving power of grating.\n" +
            "Fresnel Diffraction: Fresnel’s Assumptions. Fresnel’s Half-Period Zones for Plane Wave.\n" +
            "Explanation of Rectilinear Propagation of Light. Theory of a Zone Plate: Multiple Foci of a Zone\n" +
            "Plate. Fresnel’s Integral, Fresnel diffraction pattern of a straight edge, a slit and a wire.",
    "Polarization: Unpolarised light, linear, circular, eliptical polarized light, Malus law,\n" +
            "Polarisation by reflection, refraction, and scattering, double refraction, Nicol's prism,\n" +
            "Babinet compensator, Jones vector, Jones matrices.")
val refbooks22= arrayOf(
    "T1: Optics, Ajoy Ghatak, 2008, Tata McGraw Hill",
    "R1: Waves: Berkeley Physics Course, vol. 3, Francis Crawford, 2007, Tata McGraw-Hill.\n" +
            "R2: Fundamentals of Optics, F.A. Jenkins and H.E. White, 1981, McGraw-Hill\n" +
            "R3: Principles of Optics, Max Born and Emil Wolf, 7th Edn., 1999, Pergamon Press.\n" +
            "R4: The Physics of Vibrations and Waves, H. J. Pain, 2013, John Wiley and Sons.\n" +
            "R5: The Physics of Waves and Oscillations, N.K. Bajaj, 1998, Tata McGraw Hill.\n" +
            "R6: Fundamental of Optics, A. Kumar, H.R. Gulati and D.R. Khanna, 2011, R. Chand Publications.")
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
val refbooks24= arrayOf(
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
val modules23= arrayOf("Infinite Sequences, Convergence of Sequences, Infinite series, Convergence of Infinite Series, Tests for\n" +
        "Convergence: Comparison tests, Ratio test, Cauchy’s root test, Raabe’s test, Logarithmic Test, Gauss test,\n" +
        "Cauchy's Integral test, Alternating series, Leibnitz test, Absolute and Conditional Convergence",
    "Types of Matrix, Elementary Transformations, Rank of a Matrix, Row - reduced Echelon form, Normal\n" +
            "From, Vectors, Linear Independence and Dependence of Vectors, System of linear equations.\n" +
            "Introduction to Linear Transformations, Eigenvalues, Eigenvectors, Cayley - Hamilton theorem,\n" +
            "Diagonolisation, Quadratic forms and its different properties.",
    "Function of several variables, Limit, Continuity, Partial derivatives, Euler’s theorem for homogeneous\n" +
            "functions, Total derivatives, Chain rules, Jacobians and its properties, Taylor series for function of two\n" +
            "variables, Maxima – Minima, Lagrange’s method of multipliers. ",
    "Beta and Gamma function along with their properties.\n" +
            "Double integrals, double integrals in polar coordinates, Change of order of integration, Triple Integrals,\n" +
            "cylindrical and spherical coordinate systems, transformation of coordinates, Applications of double and\n" +
            "triple integrals in areas and volumes.",
    "Space curves, Vector valued functions, derivative of vector valued functions, tangent, normal and\n" +
            "binormal, curvature, torsion, Frenet Formulae.\n" +
            "Point functions, scalar and vector point functions, gradient, directional derivative, divergence, curl, vector\n" +
            "equations and identities. Line Integral, Work done, Conservative field, Green’s theorem in a plane,\n" +
            "Surface and volume integrals, Gauss – divergence theorem, Stoke’s theorem. ")
val refbooks23= arrayOf(
    "1. E. Kreyszig, Advanced Engineering Mathematics, 9th Edition, John Wiley & Sons, 2006.\n" +
            "2. H. Anton, I. Brivens and S. Davis, Calculus, 10th\n" +
            " Edition, John Wiley and sons, Singapore Pte. Ltd.,\n" +
            "2013.\n" +
            "3. Ramana B.V., Higher Engineering Mathematics, Tata McGraw Hill New Delhi, 11th Reprint,2010.",
    "1. M. J. Strauss, G. L. Bradley And K. J. Smith, Calculus, 3rd Ed, Dorling.Kindersley (India) Pvt. Ltd. (P\n" +
            "Ed), Delhi, 2007.\n" +
            "2. M. D. Weir, J. Hass and F. R. Giordano: Thomas’ Calculus, 11th edition, Pearson Educations, 2008.\n" +
            "3. S.C. Malik and S. Arora, Mathematical Analysis, New Age International, 1992.\n" +
            "4. David C. Lay, Linear Algebra and its Applications (3rd Edition), Pearson Ed. Asia, Indian Reprint,\n" +
            "2007.\n" +
            "5. D. G. Zill and W.S. Wright, Advanced Engineering Mathematics, Fourth Edition, 2011. ")
class Physics_sem_2 : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_physics_sem_2, container, false)
        val button1 = view.findViewById<Button>(R.id.sem2_sub1)
        val button2 = view.findViewById<Button>(R.id.sem2_sub2)
        val button4 = view.findViewById<Button>(R.id.sem2_sub4)
        val button3 = view.findViewById<Button>(R.id.sem2_sub3)
        val button5 = view.findViewById<Button>(R.id.sem2_elective1)
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
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules23)
            intent.putExtra("books", refbooks23)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules24)
            intent.putExtra("books", refbooks24)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent(activity, Physics_PPS::class.java)

            startActivity(intent)
        }
        return view
    }

    companion object {

        fun newInstance(): Physics_sem_2=Physics_sem_2()
    }
}