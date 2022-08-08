/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class CALCULAR INTERES extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? plazo = ??;
      ?? total = ??;
      ?? interes = ??;
      ?? monto = ??;
      
      plazo = 0;
      raptor_prompt_variable_zzyz = "¿Que Plazo Desea Calcular?               INGRESA: 1 PARA SEMANAL, 2 PARA QUINCENAL 3 PARA MENSUAL ";
      plazo = get???(raptor_prompt_variable_zzyz);
      if (plazo == 1)
      {
         interes = 0;
         monto = 0;
         plazo = 0;
         total = 0;
         raptor_prompt_variable_zzyz = "Por favor ingrese el INTERES a calcular";
         interes = get???(raptor_prompt_variable_zzyz);
         raptor_prompt_variable_zzyz = "Por favor ingrese el MONTO Solicitado";
         monto = get???(raptor_prompt_variable_zzyz);
         raptor_prompt_variable_zzyz = "por favor ingrese el PLAZO solicitado";
         plazo = get???(raptor_prompt_variable_zzyz);
         total = (monto * ((interes / 4) * plazo) + monto) / plazo;
         printLine("La cuota semanal es de : " + total);
      }
      else
      {
         if (plazo == 2)
         {
            interes = 0;
            monto = 0;
            plazo = 0;
            total = 0;
            raptor_prompt_variable_zzyz = "Por favor ingrese el INTERES a calcular";
            interes = get???(raptor_prompt_variable_zzyz);
            raptor_prompt_variable_zzyz = "Por favor ingrese el MONTO Solicitado";
            monto = get???(raptor_prompt_variable_zzyz);
            raptor_prompt_variable_zzyz = "por favor ingrese el PLAZO solicitado";
            plazo = get???(raptor_prompt_variable_zzyz);
            total = (monto * ((interes / 2) * plazo) + monto) / plazo;
            printLine("La cuota semanal es de : " + total);
         }
         else
         {
            if (plazo == 3)
            {
               interes = 0;
               monto = 0;
               plazo = 0;
               total = 0;
               raptor_prompt_variable_zzyz = "Por favor ingrese el INTERES a calcular";
               interes = get???(raptor_prompt_variable_zzyz);
               raptor_prompt_variable_zzyz = "Por favor ingrese el MONTO Solicitado";
               monto = get???(raptor_prompt_variable_zzyz);
               raptor_prompt_variable_zzyz = "por favor ingrese el PLAZO solicitado";
               plazo = get???(raptor_prompt_variable_zzyz);
               total = (monto * ((interes / 1) * plazo) + monto) / plazo;
               printLine("La cuota semanal es de : " + total);
            }
            else
            {
               printLine("LA OPCION QUE ELEGISTE NO ESTA DISPONIBLE");
            }
         }
      }
   } // close main
} // close CALCULAR INTERES
