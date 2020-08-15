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
val modules41= arrayOf("Complex Analysis:\n" +
        "Brief Revision of Complex Numbers and their Graphical Representation. Euler's formula, De\n" +
        "Moivre's theorem, Roots of Complex Numbers. Functions of Complex Variables. Analyticity\n" +
        "and Cauchy-Riemann Conditions. Examples of analytic functions. Singular functions: poles\n" +
        "and branch points, order of singularity, branch cuts",
    "Integration of a function of a complex\n" +
            "variable. Cauchy's Inequality. Cauchy’s Integral formula. Simply and multiply connected\n" +
            "region. Laurent and Taylor’s expansion. Residues and Residue Theorem. Application in solving\n" +
            "Definite Integral",
    "Integrals Transforms:\n" +
            "Fourier Transforms: Fourier Integral theorem. Fourier Transform. Examples. Fourier transform\n" +
            "of trigonometric, Gaussian, finite wave train & other functions. Representation of Dirac delta\n" +
            "function as a Fourier Integral. Fourier transform of derivatives, Inverse Fourier transform,\n" +
            "Convolution theorem. Properties of Fourier transforms (translation, change of scale, complex\n" +
            "conjugation, etc.). Three dimensional Fourier transforms with examples.",
    "Application of Fourier\n" +
            "Transforms to differential equations: One dimensional Wave and Diffusion/Heat Flow\n" +
            "Equations.",
    "Laplace Transforms: Laplace Transform (LT) of Elementary functions. Properties of LTs:\n" +
            "Change of Scale Theorem, Shifting Theorem. LTs of 1st and 2nd order Derivatives and\n" +
            "Integrals of Functions, Derivatives and Integrals of LTs. LT of Unit Step function, Dirac Delta\n" +
            "function, Periodic Functions. Convolution Theorem. Inverse LT. Application of Laplace\n" +
            "Transforms to 2nd order Differential Equations: Damped Harmonic Oscillator, Simple\n" +
            "Electrical Circuits, Coupled differential equations of 1st order. Solution of heat flow along\n" +
            "infinite bar using Laplace transform.")
val refbooks41= arrayOf(
    "T1: Mathematical Methods for Physics and Engineers, K.F Riley, M.P. Hobson and S. J. Bence, 3rd ed., 2006, Cambridge\n" +
            "University Press\n" +
            "T2: Mathematics for Physicists, P. Dennery and A.Krzywicki, 1967, Dover Publications",
    "R1: Complex Variables, A.S.Fokas & M.J.Ablowitz, 8th Ed., 2011, Cambridge Univ. Press\n" +
            "R2: Complex Variables, A.K. Kapoor, 2014, Cambridge Univ. Press\n" +
            "R3: Complex Variables and Applications, J.W. Brown & R.V. Churchill, 7th Ed. 2003, Tata McGraw-Hill\n" +
            "R4: First course in complex analysis with applications, D.G. Zill and P.D. Shanahan,1940, Jones & Bartlett")
val modules42= arrayOf("Planck’s quantum, Planck’s constant and light as a collection of photons; Blackbody\n" +
        "Radiation: Quantum theory of Light; Photo-electric effect and Compton scattering. De\n" +
        "Broglie wavelength and matter waves; Davisson-Germer experiment. Wave description of\n" +
        "particles by wave packets. Group and Phase velocities and relation between them. Two-\n" +
        "Slit experiment with electrons. Probability. Wave amplitude and wave functions.\n" +
        "Position measurement- gamma ray microscope thought experiment; Wave-particle duality,\n" +
        "Heisenberg uncertainty principle (Uncertainty relations involving Canonical pair of\n" +
        "variables): Derivation from Wave Packets impossibility of a particle following a\n" +
        "trajectory; Estimating minimum energy of a confined particle using uncertainty principle;\n" +
        "Energy-time uncertainty principle- application to virtual particles and range of an\n" +
        "interaction.",
    "Two slit interference experiment with photons, atoms and particles; linear superposition\n" +
            "principle as a consequence; Matter waves and wave amplitude; Schrodinger equation for\n" +
            "non-relativistic particles; Momentum and Energy operators; stationary states; physical\n" +
            "interpretation of a wave function, probabilities and normalization;",
    "Probability and\n" +
            "probability current densities in one dimension. One dimensional infinitely rigid boxenergy\n" +
            "eigen values and eigen functions, normalization; Quantum dot as example;\n" +
            "Quantum mechanical scattering and tunneling in one dimension-across a step potential &\n" +
            "rectangular potential barrier.",
    "Size and structure of atomic nucleus and its relation with atomic weight; Impossibility of\n" +
            "an electron being in the nucleus as a consequence of the uncertainty principle. Nature of\n" +
            "nuclear force, NZ graph, Liquid Drop model: semi-empirical mass formula and binding\n" +
            "energy, Nuclear Shell Model and magic numbers.\n" +
            "Radioactivity: stability of the nucleus; Law of radioactive decay; Mean life and half-life;\nAlpha decay; Beta decay- energy released, spectrum and Pauli's prediction of neutrino;\n" +
            "Gamma ray emission, energy-momentum conservation: electron-positron pair creation by\n" +
            "gamma photons in the vicinity of a nucleus.",
    "Fission and fusion- mass deficit, relativity and generation of energy; Fission - nature of\n" +
            "fragments and emission of neutrons. Nuclear reactor: slow neutrons interacting with\n" +
            "Uranium 235; Fusion and thermonuclear reactions driving stellar energy (brief qualitative\n" +
            "discussions).\n" +
            "Lasers: Einstein’s A and B coefficients. Metastable states. Spontaneous and Stimulated\n" +
            "emissions. Optical Pumping and Population Inversion. Three-Level and Four-Level\n" +
            "Lasers. Ruby Laser and He-Ne Laser. Basic lasing.")
val refbooks42= arrayOf(
    "\uF0B7 Concepts of Modern Physics, Arthur Beiser, 2002, McGraw-Hill.\n" +
            "\uF0B7 Introduction to Modern Physics, Rich Meyer, Kennard, Coop, 2002, Tata McGraw Hill\n" +
            "\uF0B7 Introduction to Quantum Mechanics, David J. Griffith, 2005, Pearson Education.\n" +
            "\uF0B7 Physics for scientists and Engineers with Modern Physics, Jewett and Serway, 2010, Cengage Learning.\n" +
            "\uF0B7 Modern Physics, G.Kaur and G.R. Pickrell, 2014, McGraw Hill\n" +
            "\uF0B7 Quantum Mechanics: Theory & Applications, A.K.Ghatak & S.Lokanathan, 2004, Macmillan",
    "\uF0B7 Modern Physics, J.R. Taylor, C.D. Zafiratos, M.A. Dubson, 2004, PHI Learning.\n" +
            "\uF0B7 Theory and Problems of Modern Physics, Schaum`s outline, R. Gautreau and W. Savin, 2nd Edn, Tata\n" +
            "McGraw-Hill Publishing Co. Ltd.\n" +
            "\uF0B7 Quantum Physics, Berkeley Physics, Vol.4. E.H.Wichman, 1971, Tata McGraw-Hill Co.\n" +
            "\uF0B7 Basic ideas and concepts in Nuclear Physics, K.Heyde, 3rd Edn., Institute of Physics Pub.\n" +
            "\uF0B7 Six Ideas that Shaped Physics: Particle Behave like Waves, T.A.Moore, 2003, McGraw Hill")
val modules43= arrayOf("Semiconductor Diodes: P and N type semiconductors. Energy Level Diagram. Conductivity and\n" +
        "Mobility, Concept of Drift velocity. PN Junction Fabrication (Simple Idea). Barrier Formation in PN\n" +
        "Junction Diode. Static and Dynamic Resistance. Current Flow Mechanism in Forward and Reverse\n" +
        "Biased Diode. Drift Velocity. Derivation for Barrier Potential, Barrier Width and Current for Step\n" +
        "Junction. Current Flow Mechanism in Forward and Reverse Biased Diode.\n" +
        "Two-terminal Devices and their Applications: (1) Rectifier Diode: Half-wave Rectifiers. Centretapped\n" +
        "and Bridge Full-wave Rectifiers, Calculation of Ripple Factor and Rectification Efficiency, Cfilter\n" +
        "(2) Zener Diode and Voltage Regulation. Principle and structure of (1) LEDs, (2) Photodiode and\n" +
        "(3) Solar Cell.",
    "Bipolar Junction transistors: n-p-n and p-n-p Transistors. Characteristics of CB, CE and CC\n" +
            "Configurations. Current gains α and β Relations between α and β. Load Line analysis of Transistors.\n" +
            "DC Load line and Q-point. Physical Mechanism of Current Flow. Active, Cutoff and Saturation\n" +
            "Regions.\n" +
            "Amplifiers: Transistor Biasing and Stabilization Circuits. Fixed Bias and Voltage Divider Bias.\n" +
            "Transistor as 2-port Network. h-parameter Equivalent Circuit. Analysis of a single-stage CE amplifier\n" +
            "using Hybrid Model. Input and Output Impedance. Current, Voltage and Power Gains. Classification\n" +
            "of Class A, B & C Amplifiers.",
    "Coupled Amplifier: Two stage RC-coupled amplifier and its frequency response.\n" +
            "Feedback in Amplifiers: Effects of Positive and Negative Feedback on Input Impedance,\n" +
            "Output Impedance, Gain, Stability, Distortion and Noise.\n" +
            "Sinusoidal Oscillators: Barkhausen's Criterion for self-sustained oscillations. RC Phase shift\n" +
            "oscillator, determination of Frequency. Hartley & Colpitts oscillators",
    "Operational Amplifiers (Black Box approach): Characteristics of an Ideal and Practical Op-Amp.\n" +
            "(IC 741) Open-loop and Closed-loop Gain. Frequency Response. CMRR. Slew Rate and concept of\n" +
            "Virtual ground.\n" +
            "Applications of Op-Amps: (1) Inverting and non-inverting amplifiers, (2) Adder, (3) Subtractor, (4)\n" +
            "Differentiator, (5) Integrator, (6) Log amplifier, (7) Zero crossing detector (8) Wein bridge oscillator",
    "Conversion: Resistive network (Weighted and R-2R Ladder). Accuracy and Resolution. A/D\n" +
            "Conversion (successive approximation)")
val refbooks43= arrayOf(
    "T1: Thomas L. Floyd. ELECTRONIC. DEVICES. 9th Edition. Prentice Hall.\n" +
            "T2: Louis Nashelsky and Robert Boylestad, Electronic Devices and Circuit Theory",
    "")
val modules44= arrayOf("Linear differential equations, Wronskian, Linear independence and dependence of solutions, Linear\n" +
        "differential equations of second and higher order, Operator method, Euler – Cauchy’s differential\n" +
        "equation, Legendre’s linear differential equation, Method of variation of parameters, Simultaneous linear\n" +
        "differential equations with constant coefficients. ",
    "Power series, ordinary and singular points of differential equation, Power and Frobenius series solutions\n" +
            "Bessel’s differential equation and its series solution, Bessel function of first kind and its properties,\n" +
            "Legendre’s differential equation and its series solution, Legendre’s polynomial and its properties,\n" ,
    "Fourier series, Euler formulae for Fourier series for length of interval\n" +
            "2\uF070 ,\n" +
            "Dirichlet conditions, Fourier\n" +
            "series for arbitrary length of interval, Half range Fourier series.\n" +
            "Linear and quasi – linear partial differential equations, Lagrange’s method, Linear – partial differential\n" +
            "equations with constant coefficients, Method of separation of variables and its application in solving one\n" +
            "dimensional wave and heat equations ",
    "Function of a complex variable, Limit, Continuity, Differentiability, Analyticity, Analytic functions,\n" +
            "Cauchy – Riemann equations (Cartesian and Polar form), Harmonic functions, Harmonic Conjugate,\n" +
            "Complex Integration, Cauchy’s theorem, Cauchy’s Integral formula, Cauchy’s Integral Formula for\n" +
            "derivatives, Cauchy's inequality, Morera's theorem",

    "Power series, Radius of convergence, Taylor and Laurent series for complex variable functions,\n" +
            "Singularities and its types, Residues, Residue theorem and its applications in evaluation of real integrals\n" +
            "of types\n" +
            "\uF0F2\n" +
            "\uF070\n" +
            "\uF071 \uF071 \uF071\n" +
            "2\n" +
            "0\n" +
            "f (cos ,sin )d\n" +
            "and\n" +
            "( ) ,\n" +
            "\uF0F2\n" +
            "\uF0A5\n" +
            "\uF02D\uF0A5\n" +
            "f x dx\n" +
            "Conformal Mapping, Bilinear Transformations. ")
val refbooks44= arrayOf(
    "1. E. Kreyszig, Advanced Engineering Mathematics, 9th Edition, John Wiley & Sons, 2006.\n" +
            "2. S. L. Ross, Differential Equations, 3rd Ed., Wiley India, 1984.\n" +
            "3. D. G. Zill and W.S. Wright, Advanced Engineering Mathematics, Fourth Edition, 2011.\n" +
            "4. J. W. Brown and R. V. Churchill, Complex Variables and Applications, 7th Ed., McGraw Hill, 2004.\n" +
            "5. R.K. Jain and S.R.K. Iyengar, Advanced Engineering Mathematics, Narosa Publishing, Third Edition,\n" +
            "2009",
    "1. W. E. Boyce and R. C. DiPrima, Elementary Differential Equations and Boundary Value Problems,\n" +
            "9\n" +
            "thEdition ., Wiley India, 2009.\n" +
            "2. N.P. Bali and Manish Goyal, A text book of Engineering Mathematics, Laxmi Publications, Reprint,\n" +
            "2008.\n" +
            "3. E. A. Coddington, An Introduction to Ordinary Differential Equations, Prentice Hall India, 1995.\n" +
            "4. G. F. Simmons, Differential Equations with Applications and Historical Notes, TMH, 2nd ed., 2003.")
class Physics_sem_4 : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_physics_sem_4, container, false)
        val button1 = view.findViewById<Button>(R.id.sem4_sub1)
        val button2 = view.findViewById<Button>(R.id.sem4_sub2)
        val button3 = view.findViewById<Button>(R.id.sem4_sub3)
        val button4 = view.findViewById<Button>(R.id.sem4_sub4)
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
        button3.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules43)
            intent.putExtra("books", refbooks43)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Syllabus::class.java)
            intent.putExtra("modules", modules44)
            intent.putExtra("books", refbooks44)
            startActivity(intent)
        }
        return view}

    companion object {

        fun newInstance(): Physics_sem_4=Physics_sem_4()
    }
}