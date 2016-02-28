Ext.define('BudgetMS.controller.treeCtrl', {
	extend : 'Ext.app.Controller',
	stores : [ 'treeMenuStore' ],
	views : [ 'ux.treeMenu' ],
	models : [],
	init : function() {
		this.control({
			'treeMenu' : {
				itemclick : this.treeItemClick 
				//itemdblclicl: this.expand
			}
		});
	},
	treeItemClick : function(tr,record,item,index,e,eOpts) {
		//console.log(record.raw);
		//console.log(tr.ownerCt);
		var treeNode = record.raw;
		var id= treeNode.id;
		var text=treeNode.text;
		var tabs=tr.ownerCt.ownerCt.ownerCt.child('tabpanel');
		var tab = tabs.getComponent(id); 
		console.log("id:",id,"text:",text,"tab:",tab);
		if(!tab){
			tabs.add({
				id:id,
				closable:true,
				title:text,
				iconCls:id, 
				xtype:id,
				closeAction:'hide'
			});
			tabs.setActiveTab(tabs.getComponent(id));
		}else{
			tabs.setActiveTab(tab);
		}
	},
	expand : function(tr,record){
		//console.log(record.data.id);
		tr.expandNode(record);
	}
});