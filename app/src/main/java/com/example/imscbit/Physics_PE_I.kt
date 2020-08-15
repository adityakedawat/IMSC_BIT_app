package com.example.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
val modulespe11= arrayOf("Linear Vector Spaces: Abstract Systems. Binary Operations and Relations. Introduction to Groups and\n" +
        "Fields. Vector Spaces and Subspaces. Linear Independence and Dependence of Vectors. Basis and\n" +
        "Dimensions of a Vector Space. Change of basis. Homomorphism and Isomorphism of Vector Spaces.\n" +
        "Linear Transformations. Algebra of Linear Transformations. Non-singular Transformations.\n" +
        "Representation of Linear Transformations by Matrices.",
    "Linear Vector Spaces: Abstract Systems. Binary Operations and Relations. Introduction to Groups and\n" +
            "Fields. Vector Spaces and Subspaces. Linear Independence and Dependence of Vectors. Basis and\n" +
            "Dimensions of a Vector Space. Change of basis. Homomorphism and Isomorphism of Vector Spaces.\n" +
            "Linear Transformations. Algebra of Linear Transformations. Non-singular Transformations.\n" +
            "Representation of Linear Transformations by Matrices.",
    "Eigen-values and Eigenvectors. Cayley- Hamiliton Theorem. Diagonalization of Matrices. Solutions\n" +
            "of Coupled Linear Ordinary Differential Equations. Functions of a Matrix",
    "Cartesian Tensors: Transformation of Co-ordinates. Einstein’s Summation Convention. Relation\n" +
            "between Direction Cosines. Tensors. Algebra of Tensors. Sum, Difference and Product of Two\n" +
            "Tensors. Contraction. Quotient Law of Tensors. Symmetric and Anti-symmetric Tensors. Invariant\n" +
            "Tensors : Kronecker and Alternating Tensors. Association of Antisymmetric Tensor of Order Two and\n" +
            "Vectors. Vector Algebra and Calculus using Cartesian Tensors : Scalar and Vector Products, Scalar and\n" +
            "Vector Triple Products. Differentiation. Gradient, Divergence and Curl of Tensor Fields. Vector\n" +
            "Identities. Tensorial Formulation of Analytical Solid Geometry : Equation of a Line. Angle Between\n" +
            "Lines. Projection of a Line on another Line. Condition for Two Lines to be Coplanar. Foot of the\n" +
            "Perpendicular from a Point on a Line. Rotation Tensor (No Derivation). Isotropic Tensors. Tensorial\n" +
            "Character of Physical Quantities. Moment of Inertia Tensor. Stress and Strain Tensors : Symmetric Nature. Elasticity Tensor. Generalized Hooke’s Law",
    "General Tensors: Transformation of Co-ordinates. Minkowski Space. Contravariant & Covariant\n" +
            "Vectors. Contravariant, Covariant and Mixed Tensors. Kronecker Delta and Permutation Tensors.\n" +
            "Algebra of Tensors. Sum, Difference & Product of Two Tensors. Contraction. Quotient Law of\n" +
            "Tensors. Symmetric and Anti-symmetric Tensors. Metric Tensor")
val refbookspe11= arrayOf(
    "1. Mathematical Tools for Physics, James Nearing, 2010, Dover Publications\n" +
            "2. Mathematical Methods for Physicists, G.B. Arfken, H.J. Weber, and F.E. Harris, 1970, Elsevier.\n" +
            "3. Modern Mathematical Methods for Physicists and Engineers, C.D. Cantrell, 2011, Cambridge University Press\n" +
            "4. Introduction to Matrices and Linear Transformations, D.T. Finkbeiner, 1978, Dover Pub.\n" +
            "5. Linear Algebra, W. Cheney, E.W.Cheney & D.R.Kincaid, 2012, Jones & Bartlett Learning\n" +
            "6. Mathematics for Physicists, Susan M. Lea, 2004, Thomson Brooks/Cole\n" +
            "7. Mathematical Methods for Physicis & Engineers, K.F.Riley, M.P.Hobson, S.J.Bence,3rd Ed., 2006, Cambridge\n" +
            "University Press",
    "")
val modulespe12= arrayOf("NANOSCALE SYSTEMS: Length scales in physics, Nanostructures: 1D, 2D and 3D nanostructures\n" +
        "(nanodots, thin films, nanowires, nanorods), Band structure and density of states of materials at\n" +
        "nanoscale, Size Effects in nano systems, Quantum confinement: Applications of Schrodinger equation-\n" +
        "Infinite potential well, potential step, potential box, quantum confinement of carriers in 3D, 2D, 1D\n" +
        "nanostructures and its consequences.",
    "SYNTHESIS OF NANOSTRUCTURE MATERIALS: Top down and Bottom up approach,\n" +
            "Photolithography. Ball milling. Gas phase condensation. Vacuum deposition. Physical vapor deposition\n" +
            "(PVD): Thermal evaporation, E-beam evaporation, Pulsed Laser deposition. Chemical vapor deposition\n" +
            "(CVD). Sol-Gel. Electro deposition. Spray pyrolysis. Hydrothermal synthesis. Preparation through\n" +
            "colloidal methods. MBE growth of quantum dots",
    "CHARACTERIZATION: X-Ray Diffraction. Optical Microscopy Scanning Electron Microscopy\n" +
            "Transmission Electron Microscopy Atomic Force Microscopy Scanning Tunneling Microscopy",
    "OPTICAL PROPERTIES: Coulomb interaction in nanostructures. Concept of dielectric constant for\n" +
            "nanostructures and charging of nanostructure. Quasi-particles and excitons. Excitons in direct and\n" +
            "indirect band gap semiconductor nanocrystals. Quantitative treatment of quasi-particles and excitons,\n" +
            "charging effects. Radiative processes: General formalization-absorption, emission and luminescence.\n" +
            "Optical properties of heterostrctures and nanostructures.",
    "ELECTRON TRANSPORT: Carrier transport in nanostrcutures. Coulomb blockade effect,\n" +
            "thermionic emission, tunneling and hoping conductivity. Defects and impurities: Deep level and\n" +
            "surface defects. APPLICATIONS: Applications of nanoparticles, quantum dots, nanowires and thin\n" +
            "films for photonic devices (LED, solar cells). Single electron transfer devices (no derivation). CNT\n" +
            "based transistors. Nanomaterial Devices: Quantum dots heterostructure lasers, optical switching and\n" +
            "optical data storage. Magnetic quantum well; magnetic dots - magnetic data storage. Micro\n" +
            "Electromechanical Systems (MEMS), Nano Electromechanical Systems (NEMS).")
val refbookspe12= arrayOf(
    "1. C.P. Poole, Jr. Frank J. Owens, Introduction to Nanotechnology (Wiley India Pvt. Ltd.).\n" +
            "2. S.K. Kulkarni, Nanotechnology: Principles & Practices (Capital Publishing Company)\n" +
            "3. K.K. Chattopadhyay and A. N. Banerjee, Introduction to Nanoscience and Technology (PHI Learning\n" +
            "Private Limited).\n" +
            "4. Richard Booker, Earl Boysen, Nanotechnology (John Wiley and Sons).\n" +
            "5. M. Hosokawa, K. Nogi, M. Naita, T. Yokoyama, Nanoparticle Technology Handbook (Elsevier, 2007).\n" +
            "6. Introduction to Nanoelectronics, V.V. Mitin, V.A. Kochelap and M.A. Stroscio, 2011, Cambridge\n" +
            "University Press.\n" +
            "7. Bharat Bhushan, Springer Handbook of Nanotechnology (Springer-Verlag, Berlin, 2004).",
    "")

class Physics_PE_I : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physics__p_e__i)
        val button1 = findViewById<Button>(R.id.pe1_sub1)
        val button2 = findViewById<Button>(R.id.pe1_sub2)

        button1.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe11)
            intent.putExtra("books", refbookspe11)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Syllabus::class.java)
            intent.putExtra("modules", modulespe12)
            intent.putExtra("books", refbookspe12)
            startActivity(intent)
        }
    }
}