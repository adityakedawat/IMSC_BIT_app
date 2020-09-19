package com.aditya.imscbit.physics

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.aditya.imscbit.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [physics_sem_1.newInstance] factory method to
 * create an instance of this fragment.
 */
val modules61= arrayOf(
    "Maxwell Field Equations: Review of Maxwell’s equations. Displacement Current. Vector and Scalar\n" +
            "Potentials. Gauge Transformations: Lorentz and Coulomb Gauge. Boundary Conditions at Interface\n" +
            "between Different Media. Wave Equations. Plane Waves in Dielectric Media. Poynting Theorem and\n" +
            "Poynting Vector. Electromagnetic (EM) Energy Density. Physical Concept of Electromagnetic Field\n" +
            "Energy Density, Momentum Density and Angular Momentum Density",
    "EM Wave Propagation in Unbounded Media: Plane EM waves through vacuum and isotropic\n" +
            "dielectric medium, transverse nature of plane EM waves, refractive index and dielectric constant,\n" +
            "wave impedance. Propagation through conducting media, relaxation time, skin depth. Wave\n" +
            "propagation through dilute plasma, electrical conductivity of ionized gases, plasma frequency,\n" +
            "refractive index, skin depth, application to propagation through ionosphere",
    "EM Wave in Bounded Media: Boundary conditions at a plane interface between two media.\n" +
            "Reflection & Refraction of plane waves at plane interface between two dielectric media-Laws of\n" +
            "Reflection & Refraction. Fresnel's Formulae for perpendicular & parallel polarization cases,\n" +
            "Brewster's law. Reflection & Transmission coefficients. Total internal reflection, evanescent waves.\n" +
            "Metallic reflection (normal Incidence)",
    "Polarization of Electromagnetic Waves: Description of Linear, Circular and Elliptical Polarization.\n" +
            "Propagation of E.M. Waves in Anisotropic Media. Symmetric Nature of Dielectric Tensor. Fresnel’s\n" +
            "Formula. Uniaxial and Biaxial Crystals. Light Propagation in Uniaxial Crystal. Double Refraction.\n" +
            "Polarization by Double Refraction. Nicol Prism. Ordinary & extraordinary refractive indices. Production & detection of Plane, Circularly and Elliptically Polarized Light. Phase Retardation Plates:\n" +
            "Quarter-Wave and Half-Wave Plates. Babinet Compensator and its Uses. Analysis of Polarized Light"
,"optical rotation. Calculation of angle of rotation. Experimental verification of Fresnel’s theory. Specific\n" +
            "rotation. Laurent’s half-shade polarimeter. Wave Guides: Planar optical wave guides. Planar\n" +
            "dielectric wave guide. Condition of continuity at interface. Phase shift on total reflection. Eigenvalue\n" +
            "equations. Phase and group velocity of guided waves. Field energy and Power transmission.\n" +
            "Optical Fibres:- Numerical Aperture. Step and Graded Indices (Definitions Only).\n" +
            "Single and Multiple Mode Fibres (Concept and Definition Only).")
val refbooks61= arrayOf(
    "\uF0B7 Introduction to Electrodynamics, D.J. Griffiths, 3rd Ed., 1998, Benjamin Cummings.\n" +
            "\uF0B7 Elements of Electromagnetics, M.N.O. Sadiku, 2001, Oxford University Press.\n" +
            "\uF0B7 Introduction to Electromagnetic Theory, T.L. Chow, 2006, Jones & Bartlett Learning\n" +
            "\uF0B7 Fundamentals of Electromagnetics, M.A.W. Miah, 1982, Tata McGraw Hill\n" +
            "\uF0B7 Electromagnetic field Theory, R.S. Kshetrimayun, 2012, Cengage Learning\n" +
            "\uF0B7 Engineering Electromagnetic, W illian H. Hayt, 8th Edition, 2012, McGraw Hill.\n" +
            "\uF0B7 Electromagnetic Field Theory for Engineers & Physicists, G. Lehner, 2010, Springer",
    "\uF0B7 Electromagnetic Fields & Waves, P.Lorrain & D.Corson, 1970, W.H.Freeman & Co.\n" +
            "\uF0B7 Electromagnetics, J.A. Edminster, Schaum Series, 2006, Tata McGraw Hill.\n" +
            "\uF0B7 Electromagnetic field theory fundamentals, B. Guru and H. Hiziroglu, 2004, Cambridge University Press")
val modules62= arrayOf("Classical Statistics: Macrostate & Microstate, Elementary Concept of Ensemble, Phase Space,\n" +
        "Entropy and Thermodynamic Probability, Maxwell-Boltzmann Distribution Law, Partition Function,\n" +
        "Thermodynamic Functions of an Ideal Gas, Classical Entropy Expression, Gibbs Paradox, Sackur\n" +
        "Tetrode equation, Law of Equipartition of Energy (with proof) – Applications to Specific Heat and\n" +
        "its Limitations, Thermodynamic Functions of a Two-Energy Levels System, Negative Temperature.",
    "Classical Theory of Radiation: Properties of Thermal Radiation. Blackbody Radiation. Pure\n" +
            "temperature dependence. Kirchhoff’s law. Stefan-Boltzmann law: Thermodynamic proof. Radiation\n" +
            "Pressure. Wien’s Displacement law. Wien’s Distribution Law. Saha’s Ionization Formula. Rayleigh-\n" +
            "Jean’s Law. Ultraviolet Catastrophe.",
    "Quantum Theory of Radiation: Spectral Distribution of Black Body Radiation. Planck’s Quantum\n" +
            "Postulates. Planck’s Law of Blackbody Radiation: Experimental Verification. Deduction of (1)\n" +
            "Wien’s Distribution Law, (2) Rayleigh-Jeans Law, (3) Stefan-Boltzmann Law, (4) Wien’s\n" +
            "Displacement law from Planck’s law.",
    "Bose-Einstein Statistics: B-E distribution law, Thermodynamic functions of a strongly Degenerate\n" +
            "Bose Gas, Bose Einstein condensation, properties of liquid He (qualitative description), Radiation as\n" +
            "a photon gas and Thermodynamic functions of photon gas. Bose derivation of Planck’s law.",
    "Fermi-Dirac Statistics: Fermi-Dirac Distribution Law, Thermodynamic functions of a Completely\n" +
            "and strongly Degenerate Fermi Gas, Fermi Energy, Electron gas in a Metal, Specific Heat of Metals,\n" +
            "Relativistic Fermi gas, White Dwarf Stars, Chandrasekhar Mass Limit.")
val refbooks62= arrayOf(
    "T1: Statistical Mechanics, R.K. Pathria, Butterworth Heinemann: 2nd Ed., 1996, Oxford University Press",
    "R1: Statistical Physics, Berkeley Physics Course, F. Reif, 2008, Tata McGraw-Hill\n" +
            "R2: Statistical and Thermal Physics, S. Lokanathan and R.S. Gambhir. 1991, Prentice Hall\n" +
            "R3: Thermodynamics, Kinetic Theory and Statistical Thermodynamics, Francis W. Sears and Gerhard L. Salinger, 1986,")

class Physics_sem_6 : Fragment() {
    // TODO: Rename and change types of parameters



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_physics_sem_6, container, false)
        val button1 = view.findViewById<Button>(R.id.sem6_sub1)
        val button2 = view.findViewById<Button>(R.id.sem6_sub2)
        val button3 = view.findViewById<Button>(R.id.sem6_sub3)
        val button4 = view.findViewById<Button>(R.id.sem6_sub4)
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
        button3.setOnClickListener {
            val intent = Intent(activity, Physics_PE_III::class.java)

            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(activity, Physics_PE_IV::class.java)

            startActivity(intent)
        }
        return view
    }

    companion object {

        fun newInstance(): Physics_sem_6 =
            Physics_sem_6()
    }
}