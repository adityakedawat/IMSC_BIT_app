package com.example.imscbit

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_physics_sem_6.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [physics_sem_1.newInstance] factory method to
 * create an instance of this fragment.
 */
val modules11 = arrayOf(
    "Fundamentals of Dynamics: Reference frames. Inertial frames; Review of Newton’s Laws of Motion. Galilean transformations; Galilean invariance.\n\n" + " Momentum of variable-mass system: motion of rocket. Motion of a projectile in Uniform gravitational field Dynamics of a system of particles. Centre of Mass. Principle of conservation of momentum. Impulse.\n\n" +
            "Work and Energy: Work and Kinetic Energy Theorem. Conservative and non-conservative forces. Potential Energy. Energy diagram. Stable and unstable equilibrium. Elastic potential energy. Force as gradient of potential energy. Work & Potential energy. Work done by nonconservative forces. Law of conservation of Energy",
    "Collisions: Elastic and inelastic collisions between particles. Centre of Mass and Laboratory frames.\n\n" +
            "Rotational Dynamics: Angular momentum of a particle and system of particles. Torque. Principle of conservation of angular momentum. Rotation about a fixed axis. Moment of Inertia. Calculation of moment of inertia for rectangular, cylindrical and spherical bodies. Kinetic energy of rotation. Motion involving both translation and rotation.\n\n" +
            "Fluid Motion: Kinematics of Moving Fluids: Poiseuille’s Equation for Flow of a Liquid through a Capillary Tube.\n\n" +
            "Elasticity: Relation between Elastic constants. Twisting torque on a Cylinder or Wire.",
    "Gravitation and Central Force Motion: Law of gravitation. Gravitational potential energy. Inertial and gravitational mass. Potential and field due to spherical shell and solid sphere. Motion of a particle under a central force field. Two-body problem and its reduction to onebody problem and its solution. The energy equation and energy diagram. Kepler’s Laws. Satellite in circular orbit and applications. Geosynchronous orbits. Weightlessness. Basic idea of global positioning system (GPS).\n\n" +
            "Oscillations: SHM: Simple Harmonic Oscillations. Differential equation of SHM and its solution. Kinetic energy, potential energy, total energy and their time-average values. Damped oscillation.\n\nForced oscillations: Transient and steady states; Resonance, sharpness of resonance; power dissipation and Quality Factor.",
    "Non-Inertial Systems: Non-inertial frames and fictitious forces. Uniformly rotating frame. Laws of Physics in rotating coordinate systems. Centrifugal force. Coriolis force and its applications. Components of Velocity and Acceleration in Cylindrical and Spherical Coordinate Systems.",
    "Special Theory of Relativity: Michelson-Morley Experiment and its outcome. Postulates of Special Theory of Relativity. Lorentz Transformations. Simultaneity and order of events. Lorentz contraction. Time dilation. Relativistic transformation of velocity, frequency and wave number. Relativistic addition of velocities. Variation of mass with velocity. Massless Particles. Mass-energy Equivalence. Relativistic Doppler effect. Relativistic Kinematics. Transformation of Energy and Momentum."
)
val refbooks11 = arrayOf(
    "1. An introduction to mechanics, D. Kleppner, R.J. Kolenkow, 1973, McGraw-Hill.\n\n" +
            "2. Mechanics, Berkeley Physics, vol.1, C.Kittel, W.Knight, et.al. 2007, Tata McGraw-Hill.\n\n" +
            "3. Physics, Resnick, Halliday and Walker 8/e. 2008, Wiley.\n\n" +
            "4. Feynman Lectures, Vol. I, R.P.Feynman, R.B.Leighton, M.Sands, 2008, Pearson Education\n\n" +
            "5. Introduction to Special Relativity, R. Resnick, 2005, John Wiley and Sons.",
    "1. Mechanics, D.S. Mathur, S. Chand and Company Limited, 2000\n\n" +
            "2. University Physics E.W.Sears, M.W Zemmsky, H.D. Young 13/e \n\n" +
            "3. Theoretical Mechanics, M.R. Spiegel, 2006, Tata McGraw Hill."
)
val modules12 = arrayOf(
"Electric Field and Electric Potential\n\n" +
"Electric field: Electric field lines. Electric flux. Gauss’ Law with applications to charge distributions with spherical, cylindrical and planar symmetry. Conservative nature of Electrostatic Field. Electrostatic Potential. Laplace’s and Poisson equations. The Uniqueness Theorem. Potential and Electric Field of a dipole. Force and Torque on a dipole.",
"Electrostatic energy of system of charges. Electrostatic energy of a charged sphere. Conductors in an electrostatic Field. Surface charge and force on a conductor. Capacitance of a system of charged conductors. Parallel-plate capacitor. Capacitance of an isolated conductor. Method of Images and its application to: (1) Plane Infinite Sheet and (2) Sphere\n\n" +
"Dielectric Properties of Matter: Electric Field in matter. Polarization, Polarization\n\n Charges. Electrical Susceptibility and Dielectric Constant. Capacitor (parallel plate, spherical, cylindrical) filled with dielectric. Displacement vector D. Relations between E, P and D. Gauss’ Law in dielectrics.",
"Magnetic Field: Magnetic force between current elements and definition of Magnetic FieldB. Biot-Savart’s Law and its simple applications: straight wire and circular loop. Current Loop as a Magnetic Dipole and its Dipole Moment (Analogy with Electric Dipole). Ampere’s Circuital Law and its application to (1) Solenoid and (2) Toroid. Properties of B: curl and divergence. Vector Potential. Magnetic Force on (1) point charge (2) current carrying wire (3) between current elements. Torque on a current loop in a uniform Magnetic Field. Magnetic Properties of Matter: Magnetization vector (M). Magnetic Intensity(H). Magnetic Susceptibility and permeability. Relation between B, H, M. Ferromagnetism. B-H curve and hysteresis.",
"Electromagnetic Induction: Faraday’s Law. Lenz’s Law. Self Inductance and Mutual\n" +
"Inductance. Reciprocity Theorem. Energy stored in a Magnetic Field. Introduction to Maxwell’s Equations. Charge Conservation and Displacement current . Electrical Circuits:\n" +
"AC Circuits: Kirchhoff’s laws for AC circuits. Complex Reactance and Impedance. Series\n" +
"LCR Circuit: (1) Resonance, (2) Power Dissipation and (3) Quality Factor, and (4) Band\n" +
"Width. Parallel LCR Circuit.",
"Network theorems: Ideal Constant-voltage and Constant-current Sources. Network Theorems: Thevenin theorem, Norton theorem, Superposition theorem, Reciprocity theorem, Maximum Power Transfer theorem. Applications to dc circuits\n\n" +
"Ballistic Galvanometer: Torque on a current Loop. Ballistic Galvanometer: Current and Charge Sensitivity. Electromagnetic damping. Logarithmic damping. CD"
)
val refbooks12 = arrayOf(
    "1. Introduction to Electrodynamics by D.J. Griffits, Prentice Hall(1999).\n\n" +
            "2. Electricity and Magnetism by E. M. Purcell and D. J. Morin, Cambridge. University press(2013)\n\n" +
            "3. Schaum’s outline of Theory and Problems of Electrical Circuits, TMH 2002, by Mahmood Nahri & J. Edminister",
    "1. Classical electrodynamics, J.D. Jackson, John and Wiley press, Third edition"
)
val modules13= arrayOf("Introduction to Business Communication:\n" +
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
val refbooks13= arrayOf(
    "T1. Communication Skills, Sanjay Kumar &PushpLata, Oxford University Press\n" +
            "T2. Business Correspondence and Report Writing,R.C.Sharma, Krishna Mohan.Mcgraw Hill\n" +
            "T3. Communication for Business,Shirley Taylor, V.Chandra, Pearson\n" +
            "T4. Business Communication- HorySankar Mukherjee, Oxford University Press\n" +
            "T5. Basic Business Communication- .Lesikar I Flatley, McGraw Hill.\n" +
            "T6. Business Communication Today ,Bovee, Thill and Chaterjee, Pearson",
    "")
//val modules14= arrayOf("",
//    "",
//    "",
//    "",
//    "")
//val refbooks14= arrayOf(
//    "",
//    "")
val modules14= arrayOf("Bohr’s theory, Wave mechanics: de Broglie equation, Heisenberg’s Uncertainty Principle, Schrödinger’s\n" +
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
val refbooks14= arrayOf(
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

class Physics_sem_1 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_physics_sem_1, container, false)
        val button1 = view.findViewById<Button>(R.id.sem1_sub1)
        val button2 = view.findViewById<Button>(R.id.sem1_sub2)
        val button4 = view.findViewById<Button>(R.id.sem1_sub4)
        val button3 = view.findViewById<Button>(R.id.sem1_sub3)
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
        return view
    }

    companion object {

        fun newInstance(): Physics_sem_1 = Physics_sem_1()
    }
}