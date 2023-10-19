/* This seed job will create a subfolder 'AWS' under 'MULE' and print echo statement.
*/

job('testSeed') {
 steps {
   folder('Mule/aws') {
     displayName('AWS')
     description('This is aws folder')
   }
  shell('echo wohoo finally successful')
 }
}
